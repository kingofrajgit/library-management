package admin;
import getinput.Inputs;
import deleteandinsert.InDel;
import checkingbooks.Display;
import com.kinlib.currenttime.CrtTime;


public class Admin {
	public static void main(String[] args) throws Exception {
		while(true) {
			int option=Inputs.choise();
		switch(option) {
		case 1:
			Inputs.getIputInsert();
			InDel.insert(Inputs.StdId,Inputs.bookid,Inputs.BookName,Inputs.TakeData);
			break;
		case 2:
			Inputs.GetIputDelet();
			InDel.delydelete(Inputs.StdId,Inputs.bookid);
			break;
		case 3:
			Inputs.GetIputDelet();
			InDel.delete(Inputs.StdId);
			break;
		case 4:
			break;
		case 5:
			Display.checkbook();
			break;
//		case 6:
//			exit(0);
			
		}
		}
	}

	
}

