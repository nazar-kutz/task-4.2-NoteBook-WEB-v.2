package languages;

import static controller.checker.CheckPatterns.*;
import static view.constants.str.InputStringGlobalConstants.*;
import static view.constants.str.UserDataStringGlobalConstants.*;

/**
 * Created by Nazar on 31.07.2017.
 */
public class EnglishLanguage extends Language {
    private final Object[][] contents = new Object[][]{
            //Input
            {INPUT_DATA, "Input a new record"},
            {INPUT_COMMENT, "Input comment: "},
            {WRONG_INPUT, "Wrong input! Repeat, please. "},
            //{NAME_AND_ADDRESS_EXIST, "User with this name and address already exist. "},
            //{EMAIL_EXIST, "Record with this email already exist. Change it! "},
            //{SKYPE_EXIST, "Record with this skype already exist. "},
            {NICKNAME_EXIST, "Record with this nickname already exist! Change it."},
            {NOW_RECORD_CONTAINS, "At the moment, record contains next information: "},
            {ERROR_RECORD_DID_NOT_ADD, "ERROR, RECORD DIDN'T ADD TO NOTEBOOK! "},
            {SAVE_RECORD, "Save"},

            //Examples
            //name, nickname, groups...
            {FIRST_NAME_EXAMPLE, "Nazar"},
            {LAST_NAME_EXAMPLE, "Kutz"},
            {PATRONYMIC_EXAMPLE, "Mikolayovich"},
            {NICKNAME_EXAMPLE, "nazar1995"},
            {GROUPS_EXAMPLE, "friends, relatives, colleagues, privates, others"},
            {HOME_PHONE_EXAMPLE, "020 2242 7475"},
            {MOBILE_PHONE_EXAMPLE, "+38(099) 14 15 352"},
            {EMAIL_EXAMPLE, "nickname@someMail.com"},
            {SKYPE_EXAMPLE, "skyrunner"},
            //address
            {CITY_INDEX_EXAMPLE, "07700"},
            {CITY_EXAMPLE, "Kiev"},
            {STREET_EXAMPLE, "Lesia Ukrainka"},
            {HOUSE_NUMBER_EXAMPLE, "12"},
            {APARTMENT_NUMBER_EXAMPLE, "5"},

            //Record info
            //common
            {RECORD_NUMBER, "Record №"},
            {COLON_SPACE, ": "},
            {FIRST_NAME, "First name: "},
            {LAST_NAME, "Last name: "},
            {PATRONYMIC, "Patronymic: "},
            {SHORT_NAME, "Short name: "},
            {NICKNAME, "Nickname: "},
            {COMMENT, "Comment: "},
            {GROUPS, "Groups: "},
            {GROUP_FRIENDS, "Friends"},
            {GROUP_RELATIVES, "Relatives"},
            {GROUP_COLLEAGUES, "Colleagues"},
            {GROUP_PRIVATES, "Privates"},
            {GROUP_OTHERS, "Others"},
            {HOME_PHONE, "Home phone: "},
            {MOBILE_PHONE, "Mobile phone: "},
            {SPARE_MOBILE_PHONE, "Spare mobile phone: "},
            {OR_NONE, "(or 'none')"},
            {EMAIL, "E-mail: "},
            {SKYPE, "Skype: "},
            //address
            {FULL_ADDRESS, "Address: "},
            {CITY_INDEX, "City index: "},
            {CITY, "City: "},
            {STREET, "Street: "},
            {HOUSE_NUMBER, "House number: "},
            {APARTMENT_NUMBER, "Apartment number: "},
            //date
            {DATE_REGISTRATION, "Date of registration: "},
            {DATE_LAST_CHANGE, "Date of last change: "},

            //Checker data
            {NAME_PATTERN, "^[a-zA-Z]+(([\\'\\,\\.\\- ][a-zA-Z ])?[a-zA-Z]*)*$"},
            {COMMON_PATTERN, "[a-zA-Z0-9]+"},
            {PHONE_PATTERN, "^(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?$"},
            {SPARE_PHONE_PATTERN, "^((\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?|(none))$"},
            {DATE_PATTERN, "((0?[13578]|10|12)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[01]?))(-|\\/)((\\d{4})|" +
                    "(\\d{2}))|(0?[2469]|11)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[0]?))(-|\\/)((\\d{4}|\\d{2})))"},
            {EMAIL_PATTERN, "^\\w+@[a-zA-Z_]{2,100}\\.[a-zA-Z]{2,3}$"},
            {GROUP_PATTERN, "^( +)?(((friends|relatives|colleagues|privates|others)[ ,]*))*$"},
            {NICK_PATTERN, "^[a-zA-Z][a-zA-z0-9\\.,\\-_]{5,31}$"},
            {POSTCODE_PATTERN, "[0-9]{5}$"},
            {CITY_PATTERN, "[a-zA-Z]+([\' -]?[-a-zA-Z]){2,50}"},
            {HOUSE_NUMBER_PATTERN, "[0-9]{1,3}$"}
    };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}