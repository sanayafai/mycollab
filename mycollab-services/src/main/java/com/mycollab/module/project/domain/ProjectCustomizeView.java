/*Domain class of table m_prj_customize_view*/
package com.mycollab.module.project.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;

@SuppressWarnings("ucd")
@Table("m_prj_customize_view")
@Alias("ProjectCustomizeView")
public class ProjectCustomizeView extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.id
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.projectId
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    @NotNull
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayMessage
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    @NotNull
    @Column("displayMessage")
    private Boolean displaymessage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayMilestone
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    @NotNull
    @Column("displayMilestone")
    private Boolean displaymilestone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayFile
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    @NotNull
    @Column("displayFile")
    private Boolean displayfile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayTimeLogging
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    @NotNull
    @Column("displayTimeLogging")
    private Boolean displaytimelogging;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayPage
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    @NotNull
    @Column("displayPage")
    private Boolean displaypage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayInvoice
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    @NotNull
    @Column("displayInvoice")
    private Boolean displayinvoice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayTicket
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    @Column("displayTicket")
    private Boolean displayticket;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        ProjectCustomizeView item = (ProjectCustomizeView)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(977, 375).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.id
     *
     * @return the value of m_prj_customize_view.id
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public ProjectCustomizeView withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.id
     *
     * @param id the value for m_prj_customize_view.id
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.projectId
     *
     * @return the value of m_prj_customize_view.projectId
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public ProjectCustomizeView withProjectid(Integer projectid) {
        this.setProjectid(projectid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.projectId
     *
     * @param projectid the value for m_prj_customize_view.projectId
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayMessage
     *
     * @return the value of m_prj_customize_view.displayMessage
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public Boolean getDisplaymessage() {
        return displaymessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public ProjectCustomizeView withDisplaymessage(Boolean displaymessage) {
        this.setDisplaymessage(displaymessage);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayMessage
     *
     * @param displaymessage the value for m_prj_customize_view.displayMessage
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public void setDisplaymessage(Boolean displaymessage) {
        this.displaymessage = displaymessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayMilestone
     *
     * @return the value of m_prj_customize_view.displayMilestone
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public Boolean getDisplaymilestone() {
        return displaymilestone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public ProjectCustomizeView withDisplaymilestone(Boolean displaymilestone) {
        this.setDisplaymilestone(displaymilestone);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayMilestone
     *
     * @param displaymilestone the value for m_prj_customize_view.displayMilestone
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public void setDisplaymilestone(Boolean displaymilestone) {
        this.displaymilestone = displaymilestone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayFile
     *
     * @return the value of m_prj_customize_view.displayFile
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public Boolean getDisplayfile() {
        return displayfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public ProjectCustomizeView withDisplayfile(Boolean displayfile) {
        this.setDisplayfile(displayfile);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayFile
     *
     * @param displayfile the value for m_prj_customize_view.displayFile
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public void setDisplayfile(Boolean displayfile) {
        this.displayfile = displayfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayTimeLogging
     *
     * @return the value of m_prj_customize_view.displayTimeLogging
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public Boolean getDisplaytimelogging() {
        return displaytimelogging;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public ProjectCustomizeView withDisplaytimelogging(Boolean displaytimelogging) {
        this.setDisplaytimelogging(displaytimelogging);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayTimeLogging
     *
     * @param displaytimelogging the value for m_prj_customize_view.displayTimeLogging
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public void setDisplaytimelogging(Boolean displaytimelogging) {
        this.displaytimelogging = displaytimelogging;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayPage
     *
     * @return the value of m_prj_customize_view.displayPage
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public Boolean getDisplaypage() {
        return displaypage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public ProjectCustomizeView withDisplaypage(Boolean displaypage) {
        this.setDisplaypage(displaypage);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayPage
     *
     * @param displaypage the value for m_prj_customize_view.displayPage
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public void setDisplaypage(Boolean displaypage) {
        this.displaypage = displaypage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayInvoice
     *
     * @return the value of m_prj_customize_view.displayInvoice
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public Boolean getDisplayinvoice() {
        return displayinvoice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public ProjectCustomizeView withDisplayinvoice(Boolean displayinvoice) {
        this.setDisplayinvoice(displayinvoice);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayInvoice
     *
     * @param displayinvoice the value for m_prj_customize_view.displayInvoice
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public void setDisplayinvoice(Boolean displayinvoice) {
        this.displayinvoice = displayinvoice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayTicket
     *
     * @return the value of m_prj_customize_view.displayTicket
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public Boolean getDisplayticket() {
        return displayticket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_customize_view
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public ProjectCustomizeView withDisplayticket(Boolean displayticket) {
        this.setDisplayticket(displayticket);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayTicket
     *
     * @param displayticket the value for m_prj_customize_view.displayTicket
     *
     * @mbg.generated Fri Apr 12 22:39:45 CDT 2019
     */
    public void setDisplayticket(Boolean displayticket) {
        this.displayticket = displayticket;
    }

    public enum Field {
        id,
        projectid,
        displaymessage,
        displaymilestone,
        displayfile,
        displaytimelogging,
        displaypage,
        displayinvoice,
        displayticket;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}