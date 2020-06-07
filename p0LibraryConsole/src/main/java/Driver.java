import com.revature.libraryconsoleapp.dao.UserRepoFile;
import com.revature.libraryconsoleapp.menu.IMenu;
import com.revature.libraryconsoleapp.menu.MainMenu;
import com.revature.libraryconsoleapp.service.BootstrapService;


public class Driver {

    public static void main(String[] args) {

        BootstrapService bootstrapService = new BootstrapService(new UserRepoFile());
        bootstrapService.checkForAdmin();

        IMenu currentMenu = new MainMenu();
        currentMenu.start();
    }
}
