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
	public static String qqSandpit ="//A[@href='#'])[1]";
	public static String qqinviteClick ="(//DIV[@class='form-item-block'])[4]";
	
	
//	QQ Sandpit Elements 
	public static String qqSandtHeader = "(//A[@href='#'])[1]";
	public static String qqSandNewquotebtn="//a[@class='btn btn-primary btn-fixed pull-right']";
	public static String qqSandCo1part ="(//SPAN)[61]";
	public static String qqSandCo2part ="//*[@id='app']/div/div/div/div/div/div/div/div/div/div/div/form/div[6]/div/div/div[1]/div[1]/div/div[2]/div/div[2]/label/span";
	public static String qqSandCo3part ="//input[@value='sandpit3@marketdojo.com']";
	public static String qqSandGetQuote= "//BUTTON[@class='btn btn-lg btn-primary m-t20 btn-sizebig'][text()='Get quotes!']";
	public static String qqSelectPart= "//SELECT[@class='form-control']";
	public static String qqSelectCo1="//option[@value='/users/home?in_sandpit_as_user=1341']";
	public static String qqSanHeaderEvent="(//A[@href='/events'])[1]";
	public static String qqInvitePartCo1 ="(//BUTTON[@type='button'])[2]";
	public static String qqInvitePartAccept= "(//A[@rel='nofollow'][text()='Accept'][text()='Accept'])[1]";
	public static String qqRfqTab="//*[contains(@href,'/lots')]";

	public static String qqPlacebid1 = "//span[@title='Steel Scrap lot 1']/parent::div/parent::div/div[6]/form/a";
	public static String qqPlacebid2 = "//span[@title='Steel Scrap lot 2']/parent::div/parent::div/div[6]/form/a";
	public static String qqPlacebid3 = "//span[@title='Steel Scrap lot 3']/parent::div/parent::div/div[6]/form/a";
	public static String qqPlacebid4 = "//span[@title='Steel Scrap lot 4']/parent::div/parent::div/div[6]/form/button";
	public static String qqPlacebid5 = "//span[@title='Steel Scrap lot 5']/parent::div/parent::div/div[6]/form/a";
	public static String qqRejectlot4 ="//span[@title='Steel Scrap lot 4']/parent::div/parent::div/div[6]/form/button";
	
	

	public static String qqEnterBids1="//div[@class='tbody-all tbody-price']/div[2]/div/input";
	public static String qqSubmitbid1 ="//button[@class='btn btn-default light-gray-color push-5-r br-green-color']";
	public static String qqConfirmPopup= "//BUTTON[@type='button'][text()='OK']";

	
	
	
	
	
	
	
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
	
	//QQ SUMMARY PAGE ELEMTNTS
	public static String qqSumCollBrif="//A[@class='collapsed'][text()='Brief']";
	public static String qqSumCollSum="//A[@role='button'][text()='Summary']";
	public static String qqSumCollPart="//A[@class='collapsed'][text()='Participant List']";
	public static String qqSumCollPart1="//a[text()='Participant List']";
//	public static String qqSumColLot1bid="//td/h5[contains(text(),'Lots')]/parent::td/parent::tr/following-sibling::tr[1]/td[2]";
	public static String qqSumColLot1bid="//A[@href='#'][text()='£ 100.00']";
	//Delete Bid 
	public static String qqSumColLot1bidDelete ="(//BUTTON[@type='button'])[3]";
	public static String qqSumColLot1bidDeletePoupup="(//BUTTON[@type='button'][text()='OK'][text()='OK'])[2]";
	public static String qqDeletebidToaster="(//DIV[text()='Bid successfully deleted'])[1]";
	public static String qqAllowResubmission ="//BUTTON[@class='btn btn-sm btn-primary pull-left'][text()='Allow resubmission']";
	
	
	//QQ Particpant End Elements MD
	public static String qqQuestionTab ="//a[@title= 'Questionnaire']";
	public static String qqAnswerFirst="//div[@id='1.1']/parent::div/child::div[2]/div/input";
	public static String qqAnswerThird= "//div[@id='1.3']/parent::div/child::div[2]/div/label[1]";
	public static String qqAnswerSecond="//div[@id='1.2']/parent::div/child::div[2]/div/div";
	public static String qqSubmitAnswer="//a[@data-action='submit_questionnaire_answers']";
	public static String qqConfirmPopupPart="//A[@id='confirmOk']";
	
                                                                //	--------------------
                                                                      //  ELEMENTS FOR THE CD (CategoryDojo)
                                                                //	------------
	
	public static String cdUname= "//input[@id='login-username']";
	public static String cdPass="//input[@id='login-password']";
	public static String cdLoginbtn="//button[@class='btn bg-purpel xs-full-width button-blue']";
	public static String cdLogout= "//a[contains(.,'Logout')]";
	public static String cdWdgtClose="//*[@id='widget-list-A']/div[1]/div[1]/aside/button[1]/i";
	public static String cdWdgtMax="//*[contains (@class, 'widget widget-category-spend_portfolios expanded')]//*[contains (@class, 'minus')]";
	public static String cdWdgtSetting ="//*[@id='widget-list-A']/div[1]/div[1]/aside/button[4]/i";
	public static String cdWdgtSavebtn = "(//INPUT[@type='submit'])[1]";
	public static String cdWdgtDropdown = "(//SELECT[@name='widget_settings[items_count]'])[1]";
	public static String cdWdgtSelectTen = "//*[@id='widget-list-A']/div[1]/form/label/select/option[2]";
	public static String cdSpendport="(//DIV[@class='widget-header ui-sortable-handle'])[1]";
	
	
	public static String cdshowall="//a[@class='btn']";
	public static String cdporttxt="//h2[text()='Portfolios']";
	public static String cdeditport="//*[contains(text(),'Edit Portfolio')]";
	
	public static String cdevent="//a[text()='With All Details ']";
	public static String cdCreatePortBtn="//a[@class='btn dropdown-toggle btn-primary']";
	public static String cdNewEvent="//a[@href='/categorydojo/portfolios/new']";
	public static String cdcat="//a[@href='/categorydojo/portfolios/227/summary']";
	public static String cdeditcat="//span[text()='Summary']";
	public static String cdClonedrp="//*[contains(@class,'btn dropdown-toggle btn-primary')]";
	public static String cdClone="//a[contains(text(),'Clone Portfolio')]";
	public static String cdlCloneselect= "//*[contains(@class,'chzn-single')]";
	public static String cdcloneselectele="//*[contains(@id,'portfolio_id_chzn_o_2')]";
	public static String cdclonepopbtn="//*[contains(@value,'Clone Portfolio')]";
	public static String cdclonemsg="//*[contains(@id,'flash_notice')]";
	public static String cdReportsummary="//*[contains(text(),'Report Summary')]";
	public static String cdExportbtn="//*[contains(text(),'Export All')]";
	public static String cdExportbyReprot="//*[contains(@id,'drop2')]";
	
	
	public static String cdSourcingstrBtn="//a[contains(@href,'sourcing_strategy_report.pdf')]";
	public static String cdSpendBtn="//a[contains(@href,'spend_complexity_report.pdf')]";
	public static String cdTimeBtn="//a[contains(@href,'time_return_report.pdf')]";
	public static String cdSavingbtn="//a[contains(@href,'savings_report.pdf')]";
	public static String cdPowerbtn="//a[contains(@href,'power_balance_report.pdf')]";
	public static String cdReportbtn= "//a[contains(@href,'report_summary.xlsx')]";
	public static String CdWidgetclose= "(//I[@class='icon-remove'])[1]";
	public static String CdgoToMDbtn="//a[@class='btn btn-primary']";
	public static String MdDashlink ="//a[@href='/home'][text()='Dashboard']";
	public static String MdHeaderlinkOpp= "//a[@href='/categorydojo/'][@class='menu-item-tab']";
	
	
                                                                //	Element used in Create new Event in CD //
	public static String cdPortName= "//input[@name='portfolio[name]']";                                             
	public static String cdPortDes="//textarea[@name='portfolio[description]']";
	public static String cdSpendOrg="//input [@name='portfolio[organisation_spend]']";
	public static String cdsaveBtn= "//input [@name='commit']";
	public static String cdSpendCat= "//*[contains(@name,'category[name]')]";
	public static String cdAnnualSpend= "//*[contains(@name, 'category[annualised_spend]')]";
	public static String cdSupplier="//*[contains (@name,'category_current_experience[possible_number_of_suppliers]')]";
	public static String cdGlobe="//input[@name='category_supply[future_source_of_supply_asia]']";
	public static String cdSupply="//input[@name='category_supply[desired_number_of_suppliers]']";
	public static String cdTender="//input[@name='category_supply[time_to_prepare]']";
	public static String cdResponse="//input[@name='category_supply[time_to_quote]']";
	public static String cdApporvSuply="//input[@name='category_supply[time_to_approve]']";
	public static String cdImplementSuply="//input[@name='category_supply[time_to_implement]']";

	
	
	
	

}