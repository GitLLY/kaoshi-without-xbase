package sei.tk.service.testSchedule;

import sei.tk.service.dao.model.vo.testSchedule.TestInfo;

/**
 * Created by �������� on 2016-04-22.
 * ��ʦ���ӡ�ɾ�����޸İ��ſ���
 */
public interface TeaSchService {
    Integer addExamSch(Long ppassportId, TestInfo testInfo);  //��ʦ��ӿ��԰��ţ��ݸ�����ѧ�����Ͱ��ţ�
    Integer delExamSch(Long ppassportId,Long testscheduleId);  //��ʦɾ�����԰��ţ����ݰ��ű�ţ�
    Integer editExamSch(Long ppassportId,TestInfo testInfo);    //��ʦ�޸Ŀ��԰��ţ����ݰ��ű�ţ�
}
