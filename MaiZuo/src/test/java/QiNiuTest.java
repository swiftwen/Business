import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

public class QiNiuTest {

	@Test
	public void testQiNiu() {
		  String file="D:/Users/wenpeng/Desktop/1.jpg";
	      
	      UploadManager uploadManager = new UploadManager();
	      String accessKey = "EO21tb15eRIFh41H74sGsL-XPGM8N_ePO7P2_ct3";
	      String secretKey = "KEaOZf3Czpa_akgp6euipQCJ2GxNENPEKUfXW1l9";
	      
	       accessKey = "F4s-QSAzKI21KP4c3gKVudr0nHNrp_aOWbYVFbKU";
	       secretKey = "ZSMDmwL4TB70JTMu2YoBfJR24mNxxXDHhg85yWaH";
	      
	      Auth auth  = Auth.create(accessKey, secretKey);
	      try {
	        byte[] data= Files.readAllBytes(Paths.get(file));
	        //String s = auth.uploadToken("easycollection-app");
	        String s="F4s-QSAzKI21KP4c3gKVudr0nHNrp_aOWbYVFbKU:ZMwkVTK6bhYG93zCkoebU5c4VsI=:eyJzY29wZSI6ImVhc3ljb2xsZWN0aW9uLWFwcCIsImRlYWRsaW5lIjoxNTAyNzA1NTQwfQ==";
	        System.out.println(s);
	        Response res = uploadManager.put(data, "1.jpg", s);
	        Zone z = Zone.zone0();
	        
	        //System.out.println(res.bodyString());
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	}
}
