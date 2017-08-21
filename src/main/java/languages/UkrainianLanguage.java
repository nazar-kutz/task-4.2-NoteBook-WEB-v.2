package languages;

import static controller.checker.CheckPatterns.*;
import static view.constants.str.InputStringGlobalConstants.*;
import static view.constants.str.UserDataStringGlobalConstants.*;

/**
 * Created by Nazar on 31.07.2017.
 */
public class UkrainianLanguage extends Language {
    private final Object[][] contents = {
            //Input
            {INPUT_DATA, "Введіть новий запис"},
            {INPUT_COMMENT, "Введіть коментар: "},
            {WRONG_INPUT, "Некоректний ввод! Повторіть, будь ласка. "},
            //{NAME_AND_ADDRESS_EXIST, "Запис з заданими ПІБ та адресою уже існує. "},
            //{EMAIL_EXIST, "Запис з заданою електронною адресою: %s - уже існує. "},
            //{SKYPE_EXIST, "Запис з заданим скайпом: %s - уже існує. "},
            {NICKNAME_EXIST, "Запис з заданим нікнеймом: %s - уже існує! Змініть його. "},
            {NOW_RECORD_CONTAINS, "В даний момент, запис включає наступну інформацію: "},
            {ERROR_RECORD_DID_NOT_ADD, "ПОМИЛКА, ЗАПИС НЕ ДОДАНО ДО ЗАПИСНОЇ КНИЖКИ! "},
            {SAVE_RECORD, "Зберегти"},

            //Examples
            //name, nickname, groups...
            {FIRST_NAME_EXAMPLE, "Назар"},
            {LAST_NAME_EXAMPLE, "Куць"},
            {PATRONYMIC_EXAMPLE, "Миколайович"},
            {NICKNAME_EXAMPLE, "nazar1995"},
            {GROUPS_EXAMPLE, "friends, relatives, colleagues, privates, others"},
            {HOME_PHONE_EXAMPLE, "020 2242 7475"},
            {MOBILE_PHONE_EXAMPLE, "+38(099) 14 15 352"},
            {EMAIL_EXAMPLE, "nickname@someMail.com"},
            {SKYPE_EXAMPLE, "skyrunner"},
            //address
            {CITY_INDEX_EXAMPLE, "07700"},
            {CITY_EXAMPLE, "Київ"},
            {STREET_EXAMPLE, "Лесі Українки"},
            {HOUSE_NUMBER_EXAMPLE, "12"},
            {APARTMENT_NUMBER_EXAMPLE, "5"},

            //Record info
            //common
            {RECORD_NUMBER, "Запис №"},
            {COLON_SPACE, ": "},
            {FIRST_NAME, "Ім'я: "},
            {LAST_NAME, "Прізвище: "},
            {PATRONYMIC, "По батькові: "},
            {SHORT_NAME, "Скорочена форма імені: "},
            {NICKNAME, "Нікнейм: "},
            {COMMENT, "Коментар: "},
            {GROUPS, "Групи: "},
            {GROUP_FRIENDS, "Друзі"},
            {GROUP_RELATIVES, "Родичі"},
            {GROUP_COLLEAGUES, "Колеги"},
            {GROUP_PRIVATES, "Приватні"},
            {GROUP_OTHERS, "Інші"},
            {HOME_PHONE, "Домашній номер: "},
            {MOBILE_PHONE, "Номер мобільного: "},
            {SPARE_MOBILE_PHONE, "Запасний номер мобільного: "},
            {OR_NONE, "(чи 'немає')"},
            {EMAIL, "E-mail: "},
            {SKYPE, "Скайп"},
            //address
            {FULL_ADDRESS, "Адреса: "},
            {CITY_INDEX, "Індекс міста: "},
            {CITY, "Місто: "},
            {STREET, "Вулиця: "},
            {HOUSE_NUMBER, "Номер будинку: "},
            {APARTMENT_NUMBER, "Номер квартири: "},
            //date
            {DATE_REGISTRATION, "Дата реєстрації: "},
            {DATE_LAST_CHANGE, "Дата внесення останніх змін: "},

            //Checker data
            {NAME_PATTERN, "^[а-яіїьєА-ЯІЄ]+(([\\'\\,\\.\\- ][а-яіїьєА-ЯІЄ])?[a-zA-Z]*)*$"},
            {COMMON_PATTERN, "[a-zA-Z0-9]+"},
            {PHONE_PATTERN, "^(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?$"},
            {SPARE_PHONE_PATTERN, "^((\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?|(нема[єю]))$"},
            {DATE_PATTERN, "((0?[13578]|10|12)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[01]?))(-|\\/)((\\d{4})|" +
                    "(\\d{2}))|(0?[2469]|11)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[0]?))(-|\\/)((\\d{4}|\\d{2})))"},
            {EMAIL_PATTERN, "^\\w+@[a-zA-Z_]{2,100}\\.[a-zA-Z]{2,3}$"},
            {GROUP_PATTERN, "^( +)?(((friends|relatives|colleagues|privates|others)[ ,]*))*$"},
            {NICK_PATTERN, "^[a-zA-Z][a-zA-z0-9\\.,\\-_]{5,31}$"},
            {POSTCODE_PATTERN, "[0-9]{5}$"},
            {CITY_PATTERN, "[а-яіїьєА-ЯІЄ]+([-\\' ]?[а-яіїьєА-ЯІЄ]){2,50}"},
            {HOUSE_NUMBER_PATTERN, "[0-9]{1,3}$"}
    };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
