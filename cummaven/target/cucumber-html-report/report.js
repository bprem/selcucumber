$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/reg.feature");
formatter.feature({
  "line": 1,
  "name": "Registrtion.",
  "description": "",
  "id": "registrtion.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Registar user",
  "description": "",
  "id": "registrtion.;registar-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "registration firm open",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter first Name \"\u003cfirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enter last Name \"\u003clastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select day \"\u003cday\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select month \"\u003cmonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select year \"\u003cyear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter your Email address \"\u003cemailAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter your address last Name \"\u003caddressLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter your company Name \"\u003caddressCompanyName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select mobile phone nymber \"\u003cmobilePhoneNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Assign an address alias \"\u003caddressAlias\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on registration button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify Registration success message",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "registrtion.;registar-user;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "day",
        "month",
        "year",
        "emailAddress",
        "addressCompanyName",
        "mobilePhoneNumber",
        "addressAlias"
      ],
      "line": 21,
      "id": "registrtion.;registar-user;;1"
    },
    {
      "cells": [
        "firstNameone",
        "lastNameone",
        "3",
        "2",
        "2013",
        "addressFirstNameone",
        "addressCompanyNameone",
        "9999999999",
        "addressAlias1"
      ],
      "line": 22,
      "id": "registrtion.;registar-user;;2"
    },
    {
      "cells": [
        "firstNametwo",
        "lastNametwo",
        "5",
        "3",
        "2010",
        "addressFirstNametwo",
        "addressCompanyNametwo",
        "9999999999",
        "addressAlias2"
      ],
      "line": 23,
      "id": "registrtion.;registar-user;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3006001264,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Registar user",
  "description": "",
  "id": "registrtion.;registar-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "registration firm open",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter first Name \"firstNameone\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enter last Name \"lastNameone\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select day \"3\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select month \"2\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select year \"2013\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter your Email address \"addressFirstNameone\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter your address last Name \"\u003caddressLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter your company Name \"addressCompanyNameone\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select mobile phone nymber \"9999999999\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Assign an address alias \"addressAlias1\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on registration button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify Registration success message",
  "keyword": "Then "
});
formatter.match({
  "location": "Regdemoqa.navigate_to_application()"
});
formatter.result({
  "duration": 13680957813,
  "status": "passed"
});
formatter.match({
  "location": "Regdemoqa.user_click_on_sign_in_link()"
});
formatter.result({
  "duration": 25599,
  "status": "passed"
});
formatter.match({
  "location": "Regdemoqa.registration_firm_open()"
});
formatter.result({
  "duration": 15294529231,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstNameone",
      "offset": 18
    }
  ],
  "location": "Regdemoqa.enter_first_Name(String)"
});
formatter.result({
  "duration": 83455188,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lastNameone",
      "offset": 17
    }
  ],
  "location": "Regdemoqa.enter_last_Name(String)"
});
formatter.result({
  "duration": 64783071,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 12
    }
  ],
  "location": "Regdemoqa.select_day(String)"
});
formatter.result({
  "duration": 451591553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 14
    }
  ],
  "location": "Regdemoqa.select_month(String)"
});
formatter.result({
  "duration": 247218844,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2013",
      "offset": 13
    }
  ],
  "location": "Regdemoqa.select_year(String)"
});
formatter.result({
  "duration": 180819916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "addressFirstNameone",
      "offset": 26
    }
  ],
  "location": "Regdemoqa.enter_your_Email_address(String)"
});
formatter.result({
  "duration": 73823196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003caddressLastName\u003e",
      "offset": 30
    }
  ],
  "location": "Regdemoqa.enter_your_address_last_Name(String)"
});
formatter.result({
  "duration": 81703141,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "addressCompanyNameone",
      "offset": 25
    }
  ],
  "location": "Regdemoqa.enter_your_company_Name(String)"
});
formatter.result({
  "duration": 89761602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9999999999",
      "offset": 28
    }
  ],
  "location": "Regdemoqa.select_mobile_phone_nymber(String)"
});
formatter.result({
  "duration": 49705501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "addressAlias1",
      "offset": 25
    }
  ],
  "location": "Regdemoqa.assign_an_address_alias(String)"
});
formatter.result({
  "duration": 86412471,
  "status": "passed"
});
formatter.match({
  "location": "Regdemoqa.click_on_registration_button()"
});
formatter.result({
  "duration": 91780227,
  "status": "passed"
});
formatter.match({
  "location": "Regdemoqa.verify_Registration_success_message()"
});
formatter.result({
  "duration": 13994,
  "status": "passed"
});
formatter.after({
  "duration": 398491526,
  "status": "passed"
});
formatter.before({
  "duration": 2526916261,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Registar user",
  "description": "",
  "id": "registrtion.;registar-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "registration firm open",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter first Name \"firstNametwo\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enter last Name \"lastNametwo\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select day \"5\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select month \"3\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select year \"2010\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter your Email address \"addressFirstNametwo\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter your address last Name \"\u003caddressLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter your company Name \"addressCompanyNametwo\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select mobile phone nymber \"9999999999\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Assign an address alias \"addressAlias2\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on registration button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify Registration success message",
  "keyword": "Then "
});
formatter.match({
  "location": "Regdemoqa.navigate_to_application()"
});
formatter.result({
  "duration": 14766089956,
  "status": "passed"
});
formatter.match({
  "location": "Regdemoqa.user_click_on_sign_in_link()"
});
formatter.result({
  "duration": 17066,
  "status": "passed"
});
formatter.match({
  "location": "Regdemoqa.registration_firm_open()"
});
formatter.result({
  "duration": 25855342975,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstNametwo",
      "offset": 18
    }
  ],
  "location": "Regdemoqa.enter_first_Name(String)"
});
formatter.result({
  "duration": 69145611,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lastNametwo",
      "offset": 17
    }
  ],
  "location": "Regdemoqa.enter_last_Name(String)"
});
formatter.result({
  "duration": 63373719,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 12
    }
  ],
  "location": "Regdemoqa.select_day(String)"
});
formatter.result({
  "duration": 466530203,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "Regdemoqa.select_month(String)"
});
formatter.result({
  "duration": 220068771,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2010",
      "offset": 13
    }
  ],
  "location": "Regdemoqa.select_year(String)"
});
formatter.result({
  "duration": 167907743,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "addressFirstNametwo",
      "offset": 26
    }
  ],
  "location": "Regdemoqa.enter_your_Email_address(String)"
});
formatter.result({
  "duration": 76637463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003caddressLastName\u003e",
      "offset": 30
    }
  ],
  "location": "Regdemoqa.enter_your_address_last_Name(String)"
});
formatter.result({
  "duration": 81408914,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "addressCompanyNametwo",
      "offset": 25
    }
  ],
  "location": "Regdemoqa.enter_your_company_Name(String)"
});
formatter.result({
  "duration": 87667201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9999999999",
      "offset": 28
    }
  ],
  "location": "Regdemoqa.select_mobile_phone_nymber(String)"
});
formatter.result({
  "duration": 50646888,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "addressAlias2",
      "offset": 25
    }
  ],
  "location": "Regdemoqa.assign_an_address_alias(String)"
});
formatter.result({
  "duration": 97387597,
  "status": "passed"
});
formatter.match({
  "location": "Regdemoqa.click_on_registration_button()"
});
formatter.result({
  "duration": 92733904,
  "status": "passed"
});
formatter.match({
  "location": "Regdemoqa.verify_Registration_success_message()"
});
formatter.result({
  "duration": 11605,
  "status": "passed"
});
formatter.after({
  "duration": 345396619,
  "status": "passed"
});
});