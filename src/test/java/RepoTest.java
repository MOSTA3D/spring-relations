//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.cegebest.demo.ui.entity.Project;
//import com.cegebest.demo.ui.repository.ProjectRepo;
//
//@SpringBootTest
//public class RepoTest {
//	
//	@Autowired
//	private ProjectRepo projectRepo;
//	@Test
//	public void testProjectRepo() {
//		try {
//			Project project = projectRepo.findById(Long.valueOf(1)).get();
//			System.out.println("from project repo testing");
//			assertEquals("s", "s");
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//}
