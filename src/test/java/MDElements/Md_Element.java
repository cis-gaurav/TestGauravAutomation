package MDElements;
import org.openqa.selenium.By;
public class Md_Element  {
	
	                       //Elements of MD Login Page 
	public static String headerCo="//*[@id='navbar-collapse']/ul/li[1]/a";
	public static String headerSgnup= "//*[@id='navbar-collapse']/ul/li[1]/a";
	public static String headerSgn= "login-link";
	public static String headerLocale= "//*[@id='navbar-collapse']/ul/li[4]/div/a/span";
	public static String uName= "login-username";
	public static String uPwd= "login-password";
	public static String commitBtn= "commit";
	public static String uRememberme= "user[remember_me]";
	public static String uForgotpassword= "//A[@href='/forgot_password?locale=en-uk']";
	public static String usgnOkta= "//*[@id='new_user']/div[3]/div[2]/a[1]";
	public static String usgnGoogle= "//*[@id='new_user']/div[3]/div[2]/a[2]";
	public static String headerProfile= "//*[@id='navbar-collapse']/ul/li[6]/a";
	public static String headerdropLogout="//*[@id='navbar-collapse']/ul/li[6]/ul/li[3]/a";
	public static String valLgt= "You are logged out.";
	public static String valMesg= "login-username-error";
	public static String vallengthU="login-username-error";
	public static String vallengthP="login-password-error";
	public static String flashmsg="(//DIV[text()=' Invalid username/password. Would you like to reset your password? Just enter your email address here: '])[1]";
	public static String flashEmail="//INPUT[@id='user_email']";
	public static String flashBtn="//BUTTON[@class='btn bg-purpel inline-submit '][text()='Send']";
	
                                                   //==========================================================
	                                                      //Elements of Quick Quotes Page 
                                                   // ================================================
	
	public static String qqButton= "//*[@id='app']/div/div/div/div/div/div/div/div[2]/div[2]/a";
	public static String qqName="QQeventName";
	public static String qqDeadline= "deadline-custom-date-time";
	public static String qqDetails="/html/body";
	public static String qqDes="/html/body[contains(text(),'Details')]";
	public static String qqPricechekbox = "//*[@id='app']/div/div/div/div/div/div/div/div/div/div/div/form/div[4]/div[1]/div/div[2]/div/label/span";
	public static String qqGetquote= "//BUTTON[@class='btn btn-lg btn-primary m-t20 btn-sizebig'][text()='Get quotes!']";
	public static String qqGetquote1= "//button[@type='submit']";
	public static String qqdisGetquote="//*[@id='app']/div/div/div/div/div/div/div/div/div/div/div/form/div[7]/button";
	public static String qqToasterr="(//DIV[text()='The deadline you have selected in the past. Please select a deadline date in the future.'])[1]";
	public static String qqDrop="//div[@class='filepicker dropzone dz-clickable']";
	public static String  qqSandpit ="//A[@href='#'])[1]";
	
	
	
	public static String qqvalName1="//SPAN[@class='text-danger'][text()='Required']";
	public static String qqvalName = "//SPAN[@class='text-danger'][text()='Name too long (can not be greater than 50 characters)']";
	public static String qqvalLotnamereq  ="//SPAN[@class='text-danger'][text()='Required']";
	public static String qqvalLotnamemax ="//SPAN[@class='text-danger'][text()='Lot Name too long (can not be greater than 150 characters)']";
	public static String qqvalLotquanum ="//SPAN[@class='text-danger'][text()='Should be a valid number']";
	public static String qqvalLotquamax ="//SPAN[@class='text-danger'][text()='Quantity must be less than 999999999999.99']";
	public static String qqvalLotMax= "//DIV[@class='text-danger'][text()='only 5 lots are allowed']";
	
	public static String qqLotName0 = "qqPrice.lots[0].name";
	public static String qqLotName1 = "qqPrice.lots[1].name";
	public static String qqLotName2="qqPrice.lots[2].name";
	public static String qqLotName3="qqPrice.lots[3].name";
	public static String qqLotName4 = "qqPrice.lots[4].name";
	public static String qqLotName5 = "qqPrice.lots[5].name";
	
	public static String qqUom0 = "qqPrice.lots[0].unit_of_measure_uomname";
	public static String qqUom1 = "qqPrice.lots[1].unit_of_measure_uomname";
	public static String qqUom2 = "qqPrice.lots[2].unit_of_measure_uomname";
	public static String qqUom3 = "qqPrice.lots[3].unit_of_measure_uomname";
	public static String qqUom4 = "qqPrice.lots[4].unit_of_measure_uomname";
	public static String qqUom5 = "qqPrice.lots[5].unit_of_measure_uomname";

	public static String qqQuantity0= "qqPrice.lots[0].quantity";
	public static String qqQuantity1= "qqPrice.lots[1].quantity";
	public static String qqQuantity2= "qqPrice.lots[2].quantity";
	public static String qqQuantity3= "qqPrice.lots[3].quantity";
	public static String qqQuantity4= "qqPrice.lots[4].quantity";
	public static String qqQuantity5= "qqPrice.lots[5].quantity";
	
	public static String qqAddlot0 =  "//*[@id='optional_prices']/div[2]/button";
	public static String qqAddlot1=  "//*[@id='optional_prices']/div[3]/button";
	public static String qqAddlot2=  "//*[@id='optional_prices']/div[4]/button";
	public static String qqAddlot3=  "//*[@id='optional_prices']/div[5]/button";
	public static String qqAddlot4=  "//*[@id='optional_prices']/div[6]/button";
	public static String qqAddlot5=  "//*[@id='optional_prices']/div[7]/button";
	
	public static String qqDelete0="(//I[@class='fa fa-trash'])[1]";
	public static String qqDelete1="(//I[@class='fa fa-trash'])[2]";
	public static String qqDelete2="(//I[@class='fa fa-trash'])[3]";
	public static String qqDelete3="(//I[@class='fa fa-trash'])[4]";
	public static String qqDelete4="(//I[@class='fa fa-trash'])[5]";
	public static String qqDelete5="(//I[@class='fa fa-trash'])[6]";

	
	public static String qqQuecheckbox="//*[@id='app']/div/div/div/div/div/div/div/div/div/div/div/form/div[5]/div[1]/div/div[2]/div/label/span";
	public static String qqQuesDrop ="qqQuestions.questionnaire[0].question_type";
	public static String qqQuesDrop1 ="qqQuestions.questionnaire[1].question_type";
	public static String qqQuesDrop2 ="qqQuestions.questionnaire[2].question_type";
	
	
	public static String qqQueName0 = "qqQuestions.questionnaire[0].title";
	public static String qqQueName1 = "qqQuestions.questionnaire[1].title";
	public static String qqQueName2 = "qqQuestions.questionnaire[2].title";
	
	public static String qqAddBtn0="//*[@id='optional_quality']/div[2]/button";
	public static String qqAddBtn1="//*[@id='optional_quality']/div[3]/button";
	public static String qqAddBtn2="//*[@id='optional_quality']/div[4]/button";
	
	public static String qqQuedel0="(//A[@href='#'])[23]";
	public static String qqQuedel1="(//A[@href='#'])[24]";
	public static String qqQuedel2="(//A[@href='#'])[25]";
	
	
	public static String  qqValQuenamemax="//*[@id='optional_quality']/div[1]/div[1]/div/span";
	public static String  qqValQuenamereq="(//SPAN[@class='text-danger'][text()='Required'][text()='Required'])[1]";
	public static String  qqValQuetype="(//SPAN[@class='text-danger'][text()='Required'][text()='Required'])[2]";
	public static String  qqQuedelete1= "//*[@id='optional_quality']/div[1]/div[3]/a/i";
	
	
	
	public static String  qqAddPart="//input[@id='react-select-2-input']";
	public static String  qqAddgroup="//button[@class='btn btn-primary btn-fontsmall modal-btn-open']";
	public static String  qqSelectgroup="(//SPAN)[74]";
	public static String qqSelectGroupDone="//BUTTON[@type='button'][text()='Done']";
	
	public static String qqEditContent="(//I[@class='fa fa-pencil-square-o'])[1]";
	public static String qqEditpoup="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']";
	public static String qqSavepop= "//BUTTON[@type='button'][text()='Submit']";
	public static String qqDeltepop="//BUTTON[@type='button'][text()='Delete']";
	
	public static String qqSumEventtype= "//DIV[text()='Quick Quotes']";
	public static String qqSumDate="//SPAN[text()='May 27, 2020 12:55 IST']";
	public static String qqSumBrief="//*[@id='collapseFour']/div/div/div/p";
	

	public static String qqSumLotname="(//SPAN[@title='Iron'][text()='Iron'][text()='Iron'])[1]";
	public static String qqSumQunty="//*[@id='collapseOne']/div/div/table/tbody/tr/td[4]";
	public static String qqSumMsg="//DIV[text()='No messages available']";
	public static String qqSumPart="//DIV[@class='status-txt orange-text']";
	
	
	public static String qqSumCollBrif="//A[@class='collapsed'][text()='Brief']";
	public static String qqSumCollSum="//A[@role='button'][text()='Summary']";
	public static String qqSumCollPart="//A[@class='collapsed'][text()='Participant List']";
	
}