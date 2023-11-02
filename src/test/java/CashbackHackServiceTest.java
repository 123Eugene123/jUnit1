import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @org.testng.annotations.Test
    public void shouldFindRemainTestOne(){
        org.testng.Assert.assertEquals(service.remain(999), 1);
    }
    @org.testng.annotations.Test
    public void shouldFindRemainTestTwo(){
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }
    @org.testng.annotations.Test
    public void shouldFindRemainTestThree(){
        org.testng.Assert.assertEquals(service.remain(1001), 999);
    }
    @org.testng.annotations.Test
    public void shouldFindRemainTestFour(){
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }
}
