package model.entity.record;

import languages.CurrentLanguage;
import languages.Language;
import model.entity.record.data.Address;
import model.entity.record.data.Group;
import model.servise.stringManipulater;
import view.constants.str.UserDataStringGlobalConstants;

import java.util.ArrayList;
import java.util.Date;

public class Record implements UserDataStringGlobalConstants{
    private int id;

    private String firstName;
    private String lastName;
    private String patronymic;
    private String shortName;

    private String nickname;
    private String comment;

    private ArrayList<Group> groups = new ArrayList<Group>();
    private String homePhone;
    private String mobilePhone;
    private String spareMobilePhone;
    private String email;
    private String skype;

    private Address address;
    private String fullAddress;

    private Date registrationDate;
    private Date lastChangeDate;

    private Language language;

    public void setLanguage(Language language) {
        this.language = language;
    }

    public static Builder getNewBuilder(){
        return new Builder();
    }

    public Record(int id, String firstName, String lastName, String patronymic, String shortName,
                  String nickname, String comment, ArrayList<Group> groups, String homePhone,
                  String mobilePhone, String spareMobilePhone, String email, String skype, Address address,
                  String fullAddress, Date registrationDate, Date lastChangeDate, Language language) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.shortName = shortName;
        this.nickname = nickname;
        this.comment = comment;
        this.groups = groups;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.spareMobilePhone = spareMobilePhone;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.fullAddress = fullAddress;
        this.registrationDate = registrationDate;
        this.lastChangeDate = lastChangeDate;
        this.language = language;
    }

    public static class Builder{
        private int id;

        private String firstName;
        private String lastName;
        private String patronymic;
        private String shortName;

        private String nickname;
        private String comment;

        private ArrayList<Group> groups = new ArrayList<Group>();
        private String homePhone;
        private String mobilePhone;
        private String spareMobilePhone;
        private String email;
        private String skype;

        private Address address;
        private String fullAddress;

        private Date registrationDate;
        private Date lastChangeDate;

        private Language language = CurrentLanguage.language;

        private Builder(){

        }

        public Builder buidId(int id) {
            this.id = id;
            return this;
        }

        public Builder buildFirstName(String firstName) {
            this.firstName = stringManipulater.setFirstCharAtUpperCase(firstName);
            return this;
        }

        public Builder buildLastName(String lastName) {
            this.lastName = stringManipulater.setFirstCharAtUpperCase(lastName);
            return this;
        }

        public Builder buildPatronymic(String patronymic) {
            this.patronymic = stringManipulater.setFirstCharAtUpperCase(patronymic);
            return this;
        }

        public Builder buildShortName() {
            this.shortName = new StringBuilder().append(lastName).append(" ").
                    append(firstName.charAt(0)).append('.').toString();
            return this;
        }

        public Builder buildNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder buildComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder buildGroups(String groupsString) {
            String[] groups = groupsString.trim().split("[, ]+");

            for (String groupString : groups){
                for(Group groupItem : Group.values()){
                    if(groupString.equalsIgnoreCase(groupItem.toString())){
                        this.groups.add(groupItem);
                    }
                }
            }
            return this;
        }

        public Builder buildHomePhone(String homePhone) {
            this.homePhone = homePhone;
            return this;
        }

        public Builder buildMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        public Builder buildSpareMobilePhone(String spareMobilePhone) {
            this.spareMobilePhone = spareMobilePhone;
            return this;
        }

        public Builder buildEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder buildSkype(String skype) {
            this.skype = skype;
            return this;
        }

        public Builder buildAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder buildFullAddress(Address address) {
            this.fullAddress = address.toString();
            return this;
        }

        public Builder buildRegistrationDate(Date registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public Record build(){
            return new Record(id, firstName, lastName, patronymic, shortName, nickname, comment, groups, homePhone,
                    mobilePhone, spareMobilePhone, email, skype, address, fullAddress, registrationDate,
                    lastChangeDate, language);
        }
    }

    public void setGroups(String groupsString) {
        String[] groups = groupsString.trim().split("[, ]+");

        for (String groupString : groups){
            for(Group groupItem : Group.values()){
                if(groupString.equalsIgnoreCase(groupItem.toString())){
                    this.groups.add(groupItem);
                }
            }
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setSpareMobilePhone(String spareMobilePhone) {
        this.spareMobilePhone = spareMobilePhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getShortName() {
        return shortName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getComment() {
        return comment;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getSpareMobilePhone() {
        return spareMobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public Address getAddress() {
        return address;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public Date getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(Date lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(language.getString(RECORD_NUMBER)).append(id).append('\n');
        sb.append(language.getString(FIRST_NAME)).append(language.getString(COLON_SPACE)).append(firstName).append(";\n");
        sb.append(language.getString(LAST_NAME)).append(language.getString(COLON_SPACE)).append(lastName).append(";\n");
        sb.append(language.getString(PATRONYMIC)).append(language.getString(COLON_SPACE)).append(patronymic).append(";\n");
        sb.append(language.getString(SHORT_NAME)).append(language.getString(COLON_SPACE)).append(shortName).append(";\n");
        sb.append(language.getString(NICKNAME)).append(language.getString(COLON_SPACE)).append(nickname).append(";\n");
        sb.append(language.getString(COMMENT)).append(language.getString(COLON_SPACE)).append(comment).append(";\n");
        sb.append(language.getString(GROUPS)).append(language.getString(COLON_SPACE)).append(groups).append(";\n");
        sb.append(language.getString(HOME_PHONE)).append(language.getString(COLON_SPACE)).append(homePhone).append(";\n");
        sb.append(language.getString(MOBILE_PHONE)).append(language.getString(COLON_SPACE)).append(mobilePhone).append(";\n");
        sb.append(language.getString(SPARE_MOBILE_PHONE)).append(language.getString(COLON_SPACE)).
                append(spareMobilePhone).append(";\n");
        sb.append(language.getString(EMAIL)).append(language.getString(COLON_SPACE)).append(email).append(";\n");
        sb.append(language.getString(SKYPE)).append(language.getString(COLON_SPACE)).append(skype).append(";\n");
        sb.append(language.getString(FULL_ADDRESS)).append(language.getString(COLON_SPACE)).append(fullAddress).append(";\n");
        sb.append(language.getString(DATE_REGISTRATION)).append(language.getString(COLON_SPACE)).
                append(registrationDate).append(";\n");
        sb.append(language.getString(DATE_LAST_CHANGE)).append(language.getString(COLON_SPACE)).
                append(lastChangeDate).append(";\n");
        return sb.toString();
    }
}
