import com.hypertek.beans.FullTimeMentor;
import com.hypertek.beans.PartTimeMentor;
import com.hypertek.configs.BeanConfigs;
import lombok.var;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanConfigs.class);

        var fullTimeMentor = context.getBean(FullTimeMentor.class);
        var partTimeMentor = context.getBean(PartTimeMentor.class);

        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
        var random =context.getBean(Double.class);
        System.out.println(random);


    }
}
