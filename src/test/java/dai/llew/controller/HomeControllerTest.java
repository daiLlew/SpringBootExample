package dai.llew.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by daiLlew on 23/09/2015.
 */
public class HomeControllerTest {

	private static final String EXPECTED_VIEW = "home";
	private static final String EXPECTED_NAME = "Rand Al'Thor";
	private static final String EXPECTED_DESC = "The Dragon Reborn!";

	private HomeController target;

	@Mock
	private Model model;

	/**
	 * Set up the test and test data.
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		target = new HomeController();

	}

	/**
	 * Test the {@link HomeController#viewHome(Model)} method.
	 * Verifies the correct view is returned and verifies the expected model attributes are present.
	 */
	@Test
	public void testViewHome() {
		String view = target.viewHome(model);
		assertEquals("Incorrect view returned test failed.", EXPECTED_VIEW, view);
		verify(model, times(1)).addAttribute("name", EXPECTED_NAME);
		verify(model, times(1)).addAttribute("description", EXPECTED_DESC);
	}

}
