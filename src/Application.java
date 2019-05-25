import com.event.core.ApplicationContext;
import com.event.core.BeforeApplicationListener;
import com.event.core.EventEnum;
import com.event.core.EventObject;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        Application app = new Application();
        //向容器注册监听器
        applicationContext.addApplicationListener(app::eventHandle);
        applicationContext.addApplicationListener(new BeforeApplicationListener());

        //添加事件源
        applicationContext.publishEvent(new EventObject("event C", EventEnum.EVENT_C));
//        applicationContext.publishEvent(new EventObject("event A", EventEnum.EVENT_A));
//        applicationContext.publishEvent(new EventObject("event default", EventEnum.DEFAULT));

    }

    /**
     * 事件处理逻辑。可以使用工厂和策略模式（反射）替换switch方式，
     * 这里就暂时不这样实现了，有兴趣的小伙伴可以使用这种方式实现。
     * @param event
     */
    private void eventHandle(EventObject event) {
        switch (event.getEventType()) {
            case EVENT_A:
                System.out.println("处理事件A:" + event.getSource());
                break;
            case EVENT_B:
                System.out.println("处理事件B:" + event.getSource());
                break;
            case EVENT_C:
                System.out.println("处理事件C:" + event.getSource());
                break;
            default:
                    System.out.println("未知事件:" + event.getSource());
                break;
        }
    }
}
