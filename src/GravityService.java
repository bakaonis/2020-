
public class GravityService extends BaseService<IGravity> {
    private final static float g = 0.098f;//比例系数
    /**
     * 万有引力
     */
    public void universalGravitation() {
        this.getElementList().forEach(gravity -> {
            if (!gravity.onTheGroud()) {
                float G = g * gravity.getQuality();
                gravity.setY((int) (gravity.getY() + G));
            }
        });
    }
}