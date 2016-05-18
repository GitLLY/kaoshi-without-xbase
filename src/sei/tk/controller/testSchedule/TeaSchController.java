package sei.tk.controller.testSchedule;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sei.tk.controller.common.TkBaseController;
import sei.tk.service.dao.model.vo.passport.SessionPassport;
import sei.tk.service.dao.model.vo.testSchedule.TestInfo;
import sei.tk.service.testSchedule.ExamInfoService;
import sei.tk.service.testSchedule.TeaSchService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by �������� on 2016-04-22.
 * ��ʦ���ӡ�ɾ�����޸İ��ſ���
 */
@Controller
@RequestMapping("/TeaSch")
public class TeaSchController extends TkBaseController {
    @Resource
    private TeaSchService teaSchService;

    @ResponseBody
    @RequestMapping("/addExamSch")
    public Integer addExamSch(HttpSession session, @RequestBody TestInfo testInfo) { //��ʦ��ӿ��԰��ţ��ݸ�����ѧ�����Ͱ��ţ�
        Long sessionPassport = null;
        if ((session.getAttribute("sessionStudent")) == null) {
            sessionPassport = ((SessionPassport) session.getAttribute("sessionTeacher")).getPpassportId();
        }else {
            sessionPassport = ((SessionPassport) session.getAttribute("sessionStudent")).getPpassportId();
        }
        return teaSchService.addExamSch(sessionPassport,testInfo);
    }

    @ResponseBody
    @RequestMapping("/delExamSch")
    public Integer delExamSch(HttpSession session, Long testscheduleId) {  //��ʦɾ�����԰��ţ����ݰ��ű�Ŷ�Ӧ�İ���ʱ�䣩
        Long sessionPassport = null;
        if ((session.getAttribute("sessionStudent")) == null) {
            sessionPassport = ((SessionPassport) session.getAttribute("sessionTeacher")).getPpassportId();
        }else {
            sessionPassport = ((SessionPassport) session.getAttribute("sessionStudent")).getPpassportId();
        }
        return teaSchService.delExamSch(sessionPassport,testscheduleId);
    }

    @ResponseBody
    @RequestMapping("/editExamSch")
    public Integer editExamSch(HttpSession session,@RequestBody  TestInfo testInfo) {  //��ʦ�޸Ŀ��԰��ţ����ݰ��ű�Ŷ�Ӧ�İ���ʱ�䣩
        Long sessionPassport = null;
        if ((session.getAttribute("sessionStudent")) == null) {
            sessionPassport = ((SessionPassport) session.getAttribute("sessionTeacher")).getPpassportId();
        }else {
            sessionPassport = ((SessionPassport) session.getAttribute("sessionStudent")).getPpassportId();
        }
        return teaSchService.editExamSch(sessionPassport, testInfo);
    }
}
