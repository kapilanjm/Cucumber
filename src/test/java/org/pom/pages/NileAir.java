package org.pom.pages;
import org.base.classes.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class NileAir extends BaseClas {
	public  NileAir() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(className = "cookie-consent-banner-accept-button")
	private WebElement Cookies;
	
	@FindBy(xpath="//a[contains(text(),'One Way')]")
	private WebElement OneWay;
	
	@FindBy(xpath="(//span[@tabindex='-1'])[1]")
	private WebElement Froms;
	
	@FindBy(xpath="(//div[@class='ui-select-match'])[1]")
	private WebElement FromsTwo;
	
	
	public WebElement getCookies() {
		return Cookies;
	}

	public void setCookies(WebElement cookies) {
		Cookies = cookies;
	}

	public WebElement getFromsTwo() {
		return FromsTwo;
	}

	public WebElement getFroms() {
		return Froms;
	}

	@FindBy(xpath="(//i[@class='caret pull-right'])[1]")
	private WebElement From ;
	
	@FindBy(xpath="(//a[@class='ui-select-choices-row-inner'])[4]")
	private WebElement FromRegion;
	
	@FindAll({@FindBy(xpath="(//div[@class='ui-select-match'])[2]")})
	private WebElement To;
	
	@FindBy(xpath="(//div[@name='E_LOCATION_1'])[2]")
	private WebElement ToOne;
	
	@FindBy(xpath="(//i[@class='caret pull-right'])[4]")
	private WebElement ToArrow;
	
	public WebElement getToArrow() {
		return ToArrow;
	}

	@FindBy(xpath="(//a[@class='ui-select-choices-row-inner'])[1]")
	private WebElement ToRegion;
	
	public WebElement getToOne() {
		return ToOne;
	}

	@FindBy(xpath="//div[text()='Gassim, Gassim Airport (ELQ)']")
	private WebElement ToELQ;
	
	public WebElement getToELQ() {
		return ToELQ;
	}

	@FindBy(xpath="//input[@class='form-control date-picker ng-isolate-scope hasDatepicker ng-touched ng-dirty ng-valid-parse ng-valid ng-valid-required']")
	private WebElement datePicker;
	
	@FindBy(xpath="//label[text()='Departing']/following::input[contains(@class,'form-control date-picker ng-pristine ng-v')]")
	private WebElement DateFollow;
	
	public WebElement getDateFollow() {
		return DateFollow;
	}

	public WebElement getDatePicker() {
		return datePicker;
	}

	public WebElement getFromRegion() {
		return FromRegion;
	}

	public WebElement getToRegion() {
		return ToRegion;
	}

	@FindAll({@FindBy(xpath="//input[@id='dp1674048250144']")})
	private WebElement Calender;
	
	@FindBy(tagName = "table")
	private WebElement Table;
	
	@FindAll({@FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all' or @data-handler='next'or@title='Next']")})
	private WebElement Next;
	
	@FindBy(xpath="(//table[@class='ui-datepicker-calendar'])[2]")
	private WebElement LastTable;
	
	@FindBy(tagName = "tbody")
	private WebElement TBody;
	
	@FindAll({@FindBy(xpath="(//a[@class='ui-state-default'and contains(text(),'15')])[2]")})
	private WebElement Date;
	
	@FindBy(xpath="(//select[@name='adult_no'])[2]")
	private WebElement Adults;
	
	@FindAll({@FindBy(xpath="(//select[@class='form-control ng-pristine ng-valid ng-touched'or@id='adult_no'or@name='adult_no'])[2]")})
	private WebElement Adult;
	
	@FindAll({@FindBy(xpath="(//option[@value='4'])[4]")})
	private WebElement AdultValue;
	
	
	public WebElement getAdults() {
		return Adults;
	}

	@FindAll({@FindBy(xpath="(//button[@type='submit' or @class='btn btn-style'])[2]")})
	private WebElement Submit;

	@FindBy(xpath="//input[@id='dp1674372896773']")
	private WebElement textDates;
	
	@FindBy(xpath="//input[@data-ng-model='$root.oneWayAmadeus.departing_date']")
	private WebElement depart;
	
	public WebElement getDepart() {
		return depart;
	}

	public WebElement getTextDates() {
		return textDates;
	}

	@FindAll({@FindBy(xpath="//input[@type='text' and @id='dp1674048250144']")})
	private WebElement TextDate;
	
	@FindAll({@FindBy(xpath="//input[@type='checkbox' and @id='acceptTravelEn']")})
	private WebElement Agree;
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'I Accept')]")})
	private WebElement Accept;
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Close')]")})
	private WebElement Cancel;

	public WebElement getOneWay() {
		return OneWay;
	}

	public WebElement getFrom() {
		return From;
	}

	public WebElement getTo() {
		return To;
	}

	public WebElement getCalender() {
		return Calender;
	}

	public WebElement getTable() {
		return Table;
	}

	public WebElement getNext() {
		return Next;
	}

	public WebElement getLastTable() {
		return LastTable;
	}

	public WebElement getTBody() {
		return TBody;
	}

	public WebElement getDate() {
		return Date;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getAdultValue() {
		return AdultValue;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getTextDate() {
		return TextDate;
	}

	public WebElement getAgree() {
		return Agree;
	}

	public WebElement getAccept() {
		return Accept;
	}

	public WebElement getCancel() {
		return Cancel;
	}
	
}
