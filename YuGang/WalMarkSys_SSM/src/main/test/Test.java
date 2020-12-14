import org.springframework.util.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Test {

    @org.junit.Test
    public void test1() throws NoSuchAlgorithmException {
        String paw = "123456";
        String md5Psw = DigestUtils.md5DigestAsHex(paw.getBytes());
        System.out.println();
    }
}
