
public enum ElementBean {
	
    Gravity(new GravityService());//重力
    private ElementBean(IBaseService service) {
        this.service = service;
    }

    private IBaseService service;

    public IBaseService getService() {
        return service;
    }

    public static void init() {
        Constant.TIMER_STOP_ON_OFF = false;//初始化timer 开关
        for (ElementBean bean : ElementBean.values()) {
            bean.getService().init();
        }
    }

    /**
     * 获取重力
     *
     * @return
     */
    public static GravityService getGravity() {
        return (GravityService) ElementBean.Gravity.getService();
    }
}
