package TestPageLocator.Common;

import Helpers.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GeneralLocators {
   // public WebElement Body;
    private Helper ctx;
    WebDriver _driver;

    public GeneralLocators(WebDriver driver) {

        this._driver = driver;
        ctx = new Helper(_driver);
    }

    @FindBy(xpath = "//*[@class='page-wrapper']//*[text()]")
    public List<WebElement> AllText;

    public String getAllText() {
        return _driver.findElement(By.xpath("//*[@class='page-wrapper']")).getText();
    };

    @FindBy(xpath = "(//*[@class='page-wrapper']//@title|//*[@class='page-wrapper']//@placeholder)")
    public List<WebElement> AllTextAttrs;

    @FindBy(xpath = "//*[@class=\"page-top\"]//*[@id=\"page-action--create\"]")
    public WebElement AddButton;
    public By NewProgramsProjectButton() { return By.xpath("//*[@class=\"page-top\"]//*[@id=\"page-action--create-program\"]"); }
    public By InactiveBtnSave() { return By.xpath("//*[@id='page--btnSave-0' and contains(@class,'disabled')]"); }
	 public By BtnSave() { return By.xpath("//*[@id='page--btnSave-0']"); }
    public By NewProjectButton() { return By.xpath("//*[@class=\"page-top\"]//*[@id=\"page-action--create-project\"]"); }
    public By NewTaskButton() { return By.xpath("//*[@class=\"page-top\"]//*[@id=\"page-action--create-button\"]"); }
    public By NewSubTaskButton() { return By.xpath("//*[@class=\"page-top\"]//*[@id=\"link_task_create_subtask\"]"); }
    public By NewPredecessorTaskButton() { return By.xpath("//*[@class=\"page-top\"]//*[@id=\"link_task_create_predecessor\"]"); }
    public By NewDescendantTaskButton() { return By.xpath("//*[@class=\"page-top\"]//*[@id=\"link_task_create_descendant\"]"); }
    @FindBy(xpath = "//*[@class=\"page-top\"]//*[@id=\"link_task_create_copy\"]")
    public  WebElement CopyTaskButton;
    @FindBy(xpath = "//*[@class=\"page-top\"]//*[@id=\"link_task_create_subtask\"]")
    public  WebElement SubTaskButton;
    @FindBy(xpath = "//*[@class=\"page-top\"]//*[@id=\"link_task_create_predecessor\"]")
    public  WebElement PredecessorButton;
    @FindBy(xpath = "//*[@class=\"page-top\"]//*[@id=\"link_task_create_descendant\"]")
    public  WebElement DescendantButton;
    public By AddUser() { return By.xpath("//*[@class=\"page-top\"]//*[@id=\"btnAddUser\"]"); }
    @FindBy(xpath = "//*[@class=\"page-top\"]//*[@id=\"btnAddGroup\"]")
    public  WebElement AddGroup;
    @FindBy(id = "page--btnSave-0")
    public  WebElement SaveButton;
    @FindBy(id = "page--btnCancel-0")
    public  WebElement CancelButton;
    @FindBy(id = "page--btnBack-0")
    public  WebElement BackButton;
    @FindBy(id = "page--btnSave-2")
    public  WebElement SaveTwoButton;
    @FindBy(id = "page--btnEdit")
    public  WebElement EditButton;
    @FindBy(id = "page-actions--menu")
    public WebElement ActionButton;
    @FindBy(id = "page--msproject_show_dialog")
    public WebElement ImportMsProjectButton;
    @FindBy(className = "expand")
    public  WebElement CrutchButton;
    @FindBy(className = "tasks_filter__content")
    public  WebElement FilterDiv;

    //MSProject
    @FindBy(id = "btnImport")
    public WebElement ImportButton;
    @FindBy(id = "msproject_import_programm_close")
    public WebElement CloseWindowMsProjectBtn;
    public By ToastSuccess() { return By.xpath("//*[contains(@class,'toast-success')]"); }
    public By ToastError() { return By.xpath("//*[contains(@class,'toast-error')]"); }
    public By MessageError() { return By.xpath("//*[@class='message error']"); }
	public By ToastWarning() { return By.xpath("//*[contains(@class,'toast-warning')]"); }
	public By ToastMessages() { return By.xpath("//*[contains(@class,'toast-message')]"); }
	public By DialogImport() { return By.xpath("//*[@id='msproject_import_programm'][contains(@style,'display')]"); }
	public By CloseXModalImport() { return By.xpath("//*[@id='msproject_import_programm_close_x']"); }
	public By CloseModalImport() { return By.xpath("//*[@id='msproject_import_programm_close']"); }
	public By NameUserMenuUser(String name) { return By.xpath("//*[@class='dropdown-menu dropdown-menu-default']//*[text()='"+name+"']"); }

    // Logout menu
    @FindBy(id = "menu_user-activator")
    public  WebElement MenuLogout;
    @FindBy(id= "menu_user-logout")
    public  WebElement ExitButton;

    // Main Menu
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-page= 'home']")
    public WebElement HomeItemMenu;
    /**
     *Menu User
     */
    @FindBy(xpath = "//*[contains(@class,'dropdown-user')]/a")
    public WebElement DropDownMenu;

    @FindBy(id = "link_administration__open_home")
    public WebElement AdministrationButton;

    @FindBy(id = "link_profile__open_profiles")
    public WebElement ProfilesButton;
    @FindBy(id = "link_profile__open_profile")
    public WebElement ProfileButton;
    
	 @FindBy(id = "link_profile__open_settings")
    public WebElement SettingsButton;
    
	 @FindBy(id = "link_profile__open_integrations")
    public WebElement IntegrationsButton;
    
	 @FindBy(id = "link_profile__open_help")
    public WebElement HelpButton;
	 @FindBy(xpath = "//body")
    public WebElement Body;
	public By SettingsBtnMenu() {return By.xpath("//*[@id='link_profile__open_settings']"); }
	public By IntegrationsBtnMenu() {return By.xpath("//*[@id='link_profile__open_integrations']"); }
	public By ProfilesBtnMenu() {return By.xpath("//*[@id='link_profile__open_profiles']"); }
	public By SubscriptionBtnMenu() {return By.xpath("//*[contains(@href,'account')]"); }

    /**
     *Administration Btn
     */
    @FindBy(xpath = "//*[@id='adm_settings']//*[@class='icon-settings']")
    public WebElement AdmSettingsBtn;
    @FindBy(xpath = "//*[@id='adm_users']//*[@class='icon-people']")
    public WebElement AdmUsersBtn;
    @FindBy(xpath = "//*[@id='link_integration_integrations']//*[@class='icon-share']")
    public WebElement AdmIntegrationBtn;
    @FindBy(xpath = "//*[@id='adm_profile__open_profiles']//*[@class='icon-layers']")
    public WebElement AdmProfilesBtn;
    @FindBy(xpath = "//*[@id='link_integration_export_queue']//*[@class='icon-drawer']")
    public WebElement AdmExportQueueBtn;
    @FindBy(xpath = "//*[@id='adm_settings']//*[@class='icon-trash']")
    public WebElement AdmTrashBtn;
    /**
     *Main Menu
     */
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-page= 'home']")
    public WebElement HomeMenu;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='dashboard'][@data-page='auto']")
    public WebElement DashboardAspectMenu;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='dashboard'][@data-page='dashboard']")
    public WebElement DashboardDashboardMenu;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='dashboard'][@data-page='projects']")
    public WebElement DashboardProjectMenu;
    /**
     Plan
     */
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='plan'][@data-page='auto']")
    public WebElement PlanAspectMenu;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='plan'][@data-page='tasks']")
    public WebElement PlanTasksItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='plan'][@data-page='stages']")
    public WebElement PlanProjectItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='plan'][@data-page='projects']")
    public WebElement PlanProgramItem;
    /**
     kanban
     */
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='kanban'][@data-page='auto']")
    public WebElement KanbanAspectMenu;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='kanban'][@data-page='tasks']")
    public WebElement KanbanTasksItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='kanban'][@data-page='stages']")
    public WebElement KanbanProjectItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='kanban'][@data-page='dashboard']")
    public WebElement KanbanProgramItem;
    /**
     schedule
     */
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='schedule'][@data-page='auto']")
    public WebElement ScheduleAspectMenu;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='schedule'][@data-page='tasks']")
    public WebElement ScheduleTasksItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='schedule'][@data-page='stages']")
    public WebElement ScheduleProjectItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='schedule'][@data-page='projects']")
    public WebElement ScheduleProgramItem;
    /**
     personnel
     */
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='personnel'][@data-page='auto']")
    public WebElement PersonnelAspectMenu;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='personnel'][@data-page='tasks']")
    public WebElement PersonnelTasksItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='personnel'][@data-page='dashboard']")
    public WebElement PersonnelStreamItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='personnel'][@data-page='plan']")
    public WebElement PersonnelEmploymentItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='personnel'][@data-page='personnel']")
    public WebElement PersonnelCompanyItem;
    /**
     resources
     */
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='resources'][@data-page='auto']")
    public WebElement ResourcesAspectMenu;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='resources'][@data-page='tasks']")
    public WebElement ResourcesTasksItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='resources'][@data-page='stages']")
    public WebElement ResourcesProjectsItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='resources'][@data-page='projects']")
    public WebElement ResourcesProgramItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='resources'][@data-page='personnel']")
    public WebElement ResourcesEmploymentItem;
    /**
     performance
     */
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='performance'][@data-page='auto']")
    public WebElement PerformanceAspectMenu;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='performance'][@data-page='personnel']")
    public WebElement PerformancePersonnelTasksItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='performance'][@data-page='activities']")
    public WebElement PerformanceActivitiesItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='performance'][@data-page='tasks']")
    public WebElement PerformanceTasksItem;
    @FindBy(xpath = "//*[@class='page-sidebar-wrapper']//*[@data-aspect='performance'][@data-page='projects']")
    public WebElement PerformanceProjectsItem;

    /**
     *  Filters Locators
     */
    @FindBy(id = "tasks_filter__project_container")
    public WebElement FilterContainerProject;

    public By NameFilterProgramm(String id) { return By.xpath("//*[@id='tasks_filter__project']//*[@id='tasks_filter__item_"+id+"']"); }
    public By NameFilterProject(String id) { return By.xpath("//*[@id='tasks_filter__stage']//*[@id='tasks_filter__item_"+id+"']"); }
    public By FilterClass(String nametag) { return By.xpath("//*[contains(@class, 'tasks_filter__"+nametag+"')]"); }
    public By ProgramFilter() { return FilterClass("project_anchor"); }
    public By ProgramResetFilter() { return FilterClass("project_delete"); }
    public By ProjectFilter() { return FilterClass("stage_anchor"); }
    public By ProjectResetFilter() { return FilterClass("stage_delete"); }

    public WebElement DropDownListFilter(String namefilter) {
        String xpath = "//*[@class='tasks_filter__dropdown_list']//*[text()='" + namefilter + "']";
        return _driver.findElement(By.xpath(xpath));
    }
    public WebElement DropDownListTagFilter(String namefilter) {return _driver.findElement(By.xpath("//*[@class='tasks_filter__dropdown_list']//*[@data-id='"+namefilter+"']")); }
    public WebElement ProjectEmptyFilter() { return _driver.findElement(By.xpath("//*[@class='undefined_empty tasks_filter__emptymsg']")); }
    //public WebElement ProjectMissingFilter() { return _driver.findElement(By.xpath("//*[contains(@class,'tasks_filter__hidden11')]"));    }
    public By ProjectMissingFilter() { return By.xpath("//*[@class='tasks_filter__container tasks_filter__stage_container tasks_filter__item  tasks_filter__hidden']");    }
    public By ProjectMissingFilterResources() { return By.xpath("//*[contains(@class,'tasks_filter__stage_container tasks_filter__item tasks_filter__extra')]");    }
    //public By ProjectMissingFilter By.xpath("//*[contains(@class,'tasks_filter__hidden11233')]");
    public By FilterCheck(String name) { return By.xpath("//*[@id='tasks_filter']//a[text()='"+name+"']"); }
    public By ExecutorFilter() { return FilterClass("executor_anchor"); }
    public By ExecutorResetFilter() { return FilterClass("executor_delete"); }
    public By OriginatorFilter() { return FilterClass("originator_anchor"); }
    public By OriginatorResetFilter() { return FilterClass("originator_delete"); }
    public By WorkmodeFilter() { return FilterClass("workmode_anchor"); }
    public By WorkmodeResetFilter() { return FilterClass("workmode_delete"); }
    public By TagsFilter() { return FilterClass("tags_anchor"); }
    public By TagsResetFilter() { return FilterClass("tags_delete"); }

    public By AlertDanger() { return By.xpath("//*[@class='alert alert-danger']"); }

    @FindBy(xpath = "//*[@class='tasks_filter__dropdown_list']")
    public WebElement DropDown;

    @FindBy(id= "tasks_filter__btnExpand")
    public WebElement IconSetting;

    @FindBy(xpath = "//*[@data-status='all']")
    public WebElement AllTaskFilter;
    @FindBy(xpath = "//*[@data-status='planned']")
    public WebElement PlannedTaskFilter;
    @FindBy(xpath = "//*[@data-status='new']")
    public WebElement NewTaskFilter;
    @FindBy(xpath = "//*[@data-status='followup']")
    public WebElement NextTaskFilter;
    @FindBy(xpath = "//*[@class='page-status-selector-main']//span[2]//a[2]")
    public WebElement PlannedTaskDropDownFilter;

    @FindBy(xpath = "//*[@data-status='active']")
    public WebElement ActiveTaskFilter;
    @FindBy(xpath = "//*[@data-status='actual']")
    public WebElement ActualTaskFilter;
    @FindBy(xpath = "//*[@class='page-status-selector-main']//span[3]//a[2]")
    public WebElement ActiveTaskDropDownFilter;

    public By ReсentTaskFilter (){  return By.xpath("//*[@class='dropdown-menu']//*[@data-status='recent']");  }
    public By CompletedTaskFilter (){  return By.xpath("//*[@class='dropdown-menu']//*[@data-status='completed']");  }
    @FindBy(xpath = "//*[@class='dropdown-menu']//*[@data-status='stopped']")
    public WebElement StoppedFilter;
	 
    @FindBy(xpath = "//*[contains(@class, 'page-status-selector__menu_completed')]")
    public WebElement CompletedTaskDropDownFilter;
	 
    public By CompletedTaskDropDownFilterLocator(){ 
		 return By.xpath("//*[contains(@class, 'page-status-selector__menu_completed')]");
	 }

    public By WorkmodePlanning (){  return By.xpath("//*[@id='workmode_planning']");  }
    public By WorkmodeManaging (){  return By.xpath("//*[@id='workmode_managing']");  }
    public By WorkmodeAnalysis (){  return By.xpath("//*[@id='workmode_analysis']");  }

    @FindBy(id = "workmode_planning")
    public By WorkmodePlanning;
    @FindBy(id = "workmode_managing")
    public By WorkmodeManaging;
    @FindBy(id = "workmode_analysis")
    public By WorkmodeAnalysis;


    /**
     * Locators Scale and Layers
     */
    // Scale
    @FindBy(xpath = "//*[contains(@class, 'schedule_zoom_mobile__visible schedule_zoom')]/a")
    public WebElement ScaleButton;
    @FindBy(xpath = "//*[@class='dropdown-menu pull-right']//*[@data-scale='months']")
    public WebElement ScaleOnMonths;
    @FindBy(xpath = "//*[@class='dropdown-menu pull-right']//*[@data-scale='weeks']")
    public WebElement ScaleOnWeeks;
    @FindBy(xpath = "//*[@class='dropdown-menu pull-right']//*[@data-scale='days']")
    public WebElement ScaleOnDays;

    @FindBy(xpath = "//*[@class='row header']//*[@class='row date day wd'][last()]")
    public WebElement TimeLineOnWeeks;

    /**
     * Search
     */
    // Scale
    @FindBy(id = "page--quickSearch--txtSearch")
    public WebElement SearchField;
    @FindBy(id = "page--quickSearch--btnSearch")
    public WebElement SearchButton;
    public By SearcheResultTask(String nameTask) { return By.xpath("//*[@data-collapse='persist']//*[@class='search_result__result_link'][contains(text(),'"+nameTask+"')]"); }

    /**
     * Profile
     */

    public By ProfileUser(String user, String profile) { return By.xpath("//*[@id='listholder']//*[text()='"+user+"']//ancestor::tr//*[@value='"+profile+"']//../span"); }
    @FindBy(id = "page--saveChanges")
    public WebElement SaveChangesProfile;

    /**
     * Editor Locators
     */

    // Mediawiki


    public By ReportFieldMediawiki (){  return By.xpath("//*[@id='markItUpPage--txtReport']//*[@id='page--txtReport']");  }
    public By DescriptionFieldMediawiki (){  return By.xpath("//*[@id='markItUpPage--desc']//*[@id='page--desc']");  }
    public By CommentFieldMediawiki (){  return By.xpath("//*[@id='markItUpPage--commentsWidget--txtComment']//*[@id='page--commentsWidget--txtComment']");  }


    public By PreviewReportBtnMediawiki (){  return By.xpath("//*[@id='page--txtReport']//ancestor::div[@class='form-group']//*[@class='link-button settings']");  }
    public By PreviewDescriptionBtnMediawiki (){  return By.xpath("//*[@id='page--desc']//ancestor::div[@class='form-group']//*[@class='link-button settings']");  }
    public By PreviewCommentBtnMediawiki (){  return By.xpath("//*[@id='page--commentsWidget--txtComment']//ancestor::div[@class='portlet-body']//*[@class='link-button settings']");  }

    public By PreviewFieldMediawiki (String text){  return By.xpath("//*[@id='preview-description-row']//*[text()=' "+text+"']");  }

    // Wysiwyg

    public By SwitchWysiwyg (){  return By.xpath("//*[@class='te-mode-switch']//*[contains(@class,'wysiwyg')]");  }

   public By ReportFieldWysiwyg (){  return By.xpath("//*[@id='page--txtReport']//*[@class='te-editor']//*[contains(@class,'tui-editor-contents')]");  }
   public By DescriptionFieldWysiwyg (){  return By.xpath("//*[@id='page--desc']//*[@class='te-editor']//*[contains(@class,'tui-editor-contents')]");  }
   public By CommentFieldWysiwyg (){  return By.xpath("//*[@id='page--commentsWidget--txtComment']//*[@class='te-editor']//*[contains(@class,'tui-editor-contents')]");  }

   // Markdown
   public By SwitchMarkdown (){  return By.xpath("//*[@class='te-mode-switch']//*[contains(@class,'markdown')]");  }
   public By SwitchMarkdownReport (){  return By.xpath("//*[@id='page--txtReport']//*[@class='te-mode-switch']//*[contains(@class,'markdown')]");  }

   public By ReportFieldMarkdown (){  return By.xpath("(//*[@id='page--txtReport']//*[contains(@class,'CodeMirror')]//textarea)[1]");  }
   public By DescriptionFieldMarkdown (){  return By.xpath("(//*[contains(@class,'CodeMirror')]//textarea)[1]");  }

   public By CommentFieldMarkdown (){  return By.xpath("(//*[@id='page--commentsWidget--txtComment']//*[contains(@class,'CodeMirror')]//textarea)[1]");  }

//	public  ToastError() {
//		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//	}



}
