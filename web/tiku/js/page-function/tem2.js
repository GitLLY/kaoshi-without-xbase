/**
 * Created by �������� on 2016-05-03.
 */
var b = $("#delete").find(".modal-body");
b.html("<p>��ȷ��Ҫ����ѡ�е�" + "<font color='#d9534f'>" + n + "</font>" + "����?</p>")
$('#delete').modal({backdrop: 'static', keyboard: false});
$(".btn-delete-modal").click(function () {
    var ids = new Array();
    for (var i = 0; i < $(".table tr input:checked").length; i++) {
        var ch = $(".table tr input:checked:eq(" + i + ")");
        ids.push(ch.val());
    }
    $.ajax({
        url: "/TeaSch/delExamSch.do",
        type: "post",
        dataType: "json",
        data: {
            testscheduleId: ids
        },
        error: function () {
            alert("���¼��");
        },
        success: function (data) {
            var a = $("#tip").find(".modal-body");
            if (data == null) {
                alert("���¼��");
            } else {
                a.html("<p>ɾ���ɹ�</p>");
                $('#delete').modal("hide");
                $('#tip').modal({backdrop: 'static', keyboard: false});
                $('#delete').on('hidden.bs.modal', function () {
                    $.ajax({
                        type: "get",
                        url: "tiku/page/teacher/teacher-arrange-test.html",
                        beforeSend: function () {
                            $(".main-block").html("<div class='myJava'>���ݼ�����...</div>")
                        },
                        success: function (result) {
                            $(".main-block").html("");
                            $(".main-block").append(result);
                        },
                        error: function () {
                            $(".main-block").html("<div class='wrong404'></div>")
                        }
                    })
                })
            }
            $('.btn-delete-modal').unbind();
        },
        error: function (request) {
            var a = $("#tip").find(".modal-body");
            a.html("<p>�������</p>");
            $('#tip').modal({backdrop: 'static', keyboard: false});
        }
    });
});
