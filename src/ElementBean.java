
public enum ElementBean {
	
    Gravity(new GravityService());//����
    private ElementBean(IBaseService service) {
        this.service = service;
    }

    private IBaseService service;

    public IBaseService getService() {
        return service;
    }

    public static void init() {
        Constant.TIMER_STOP_ON_OFF = false;//��ʼ��timer ����
        for (ElementBean bean : ElementBean.values()) {
            bean.getService().init();
        }
    }

    /**
     * ��ȡ����
     *
     * @return
     */
    public static GravityService getGravity() {
        return (GravityService) ElementBean.Gravity.getService();
    }
}
