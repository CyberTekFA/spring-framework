import com.hypertek.beans.FullTimeMentor;
import com.hypertek.beans.PartTimeMentor;
import com.hypertek.configs.BeanConfigs;
import com.hypertek.stereotype_annotations.Agile;
import com.hypertek.stereotype_annotations.Java;
import com.hypertek.stereotype_annotations.Selenium;
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

        var agile = context.getBean(Agile.class);
        var java = context.getBean(Java.class);
        var selenium = context.getBean(Selenium.class);
        agile.JavaCourse();
        java.JavaCourse();
        selenium.JavaCourse();

    }
}
