package main.chameleon;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Yoon-jae on 7/16/2016.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class TestSample {
    @Test
    public void test() {
        assertThat(25,is(25));
    }
}
