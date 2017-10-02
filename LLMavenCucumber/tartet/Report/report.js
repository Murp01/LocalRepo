$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdditionalNewsletterForm.feature");
formatter.feature({
  "line": 1,
  "name": "Newsletter signup",
  "description": "",
  "id": "newsletter-signup",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "add all mandatory details and send form",
  "description": "",
  "id": "newsletter-signup;add-all-mandatory-details-and-send-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user opens the newsletter page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "opens the form",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "completes all mandatory fields",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "clicks submite",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the form will send",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "a success message will appear",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.the_user_opens_the_newsletter_page()"
});
formatter.result({
  "duration": 13791463701,
  "status": "passed"
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.opens_the_form()"
});
formatter.result({
  "duration": 265607,
  "status": "passed"
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.completes_all_mandatory_fields()"
});
formatter.result({
  "duration": 147844,
  "status": "passed"
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.clicks_submite()"
});
formatter.result({
  "duration": 143364,
  "status": "passed"
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.the_form_will_send()"
});
formatter.result({
  "duration": 149764,
  "status": "passed"
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.a_success_message_will_appear()"
});
formatter.result({
  "duration": 205446,
  "status": "passed"
});
formatter.uri("CommonPrimaryNavigation.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the primary navigation bar",
  "description": "",
  "id": "testing-the-primary-navigation-bar",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 6,
      "value": "#Scenario: Click on the About Us link"
    },
    {
      "line": 7,
      "value": "#This test is ran using parameters"
    },
    {
      "line": 8,
      "value": "#When Clicking on the \"About Us\" link in the primary navigation"
    },
    {
      "line": 9,
      "value": "#Then Assert that the url contains \"About Us\""
    },
    {
      "line": 10,
      "value": "#Scenario: Click on the Client Services link"
    },
    {
      "line": 11,
      "value": "#This test is ran using parameters"
    },
    {
      "line": 12,
      "value": "#When Clicking on the \"Client Services\" link in the primary navigation"
    },
    {
      "line": 13,
      "value": "#Then Assert that the url contains \"Client Services\""
    }
  ],
  "line": 16,
  "name": "Open the search box",
  "description": "",
  "id": "testing-the-primary-navigation-bar;open-the-search-box",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I click on the search icon",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "the search box will open",
  "keyword": "Then "
});
formatter.scenarioOutline({
  "line": 21,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 23,
  "name": "Clicking on the \u003cLink\u003e link in the primary navigation DT",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Assert that the url contains \u003cTitle\u003e DT",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;",
  "rows": [
    {
      "cells": [
        "Link",
        "Title"
      ],
      "line": 27,
      "id": "testing-the-primary-navigation-bar;click-all-links;;1"
    },
    {
      "cells": [
        "About Us",
        "About Us"
      ],
      "line": 28,
      "id": "testing-the-primary-navigation-bar;click-all-links;;2"
    },
    {
      "cells": [
        "Client Services",
        "Client Services"
      ],
      "line": 29,
      "id": "testing-the-primary-navigation-bar;click-all-links;;3"
    },
    {
      "cells": [
        "Sectors",
        "Sectors"
      ],
      "line": 30,
      "id": "testing-the-primary-navigation-bar;click-all-links;;4"
    },
    {
      "cells": [
        "Find a Lawyer",
        "Find a Lawyer"
      ],
      "line": 31,
      "id": "testing-the-primary-navigation-bar;click-all-links;;5"
    },
    {
      "cells": [
        "Locations",
        "Locations"
      ],
      "line": 32,
      "id": "testing-the-primary-navigation-bar;click-all-links;;6"
    },
    {
      "cells": [
        "Insights",
        "Insights"
      ],
      "line": 33,
      "id": "testing-the-primary-navigation-bar;click-all-links;;7"
    },
    {
      "cells": [
        "Careers",
        "Careers"
      ],
      "line": 34,
      "id": "testing-the-primary-navigation-bar;click-all-links;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4751936854,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 9799024229,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 23,
  "name": "Clicking on the About Us link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Assert that the url contains About Us DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "About Us",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 3791511703,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "About Us",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 35774425,
  "status": "passed"
});
formatter.after({
  "duration": 603246681,
  "status": "passed"
});
formatter.before({
  "duration": 4076838595,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 9114321226,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 23,
  "name": "Clicking on the Client Services link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Assert that the url contains Client Services DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Client Services",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 2342269259,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Client Services",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 46297594,
  "status": "passed"
});
formatter.after({
  "duration": 572746002,
  "status": "passed"
});
formatter.before({
  "duration": 4243701427,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 7723450950,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 23,
  "name": "Clicking on the Sectors link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Assert that the url contains Sectors DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sectors",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 4358612749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sectors",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 49527763,
  "status": "passed"
});
formatter.after({
  "duration": 2297503227,
  "status": "passed"
});
formatter.before({
  "duration": 2922280741,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 7892919933,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 23,
  "name": "Clicking on the Find a Lawyer link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Assert that the url contains Find a Lawyer DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Find a Lawyer",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 2019302931,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find a Lawyer",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 68435803,
  "status": "passed"
});
formatter.after({
  "duration": 485644084,
  "status": "passed"
});
formatter.before({
  "duration": 3276739136,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 7339782151,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 23,
  "name": "Clicking on the Locations link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Assert that the url contains Locations DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Locations",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 3313961280,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Locations",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 29379368,
  "status": "passed"
});
formatter.after({
  "duration": 535731863,
  "status": "passed"
});
formatter.before({
  "duration": 3591927330,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 7373949491,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 23,
  "name": "Clicking on the Insights link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Assert that the url contains Insights DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Insights",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 3107464077,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Insights",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 1821023555,
  "status": "passed"
});
formatter.after({
  "duration": 590399608,
  "status": "passed"
});
formatter.before({
  "duration": 3657112484,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 7688282621,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 23,
  "name": "Clicking on the Careers link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Assert that the url contains Careers DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Careers",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 3316899601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Careers",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 76425783,
  "status": "passed"
});
formatter.after({
  "duration": 529172963,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 37,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@Firefox"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 39,
  "name": "Clicking on the \u003cLink\u003e link in the primary navigation DT",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Assert that the url contains \u003cTitle\u003e DT",
  "keyword": "Then "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;",
  "rows": [
    {
      "cells": [
        "Link",
        "Title"
      ],
      "line": 43,
      "id": "testing-the-primary-navigation-bar;click-all-links;;1"
    },
    {
      "cells": [
        "About Us",
        "About Us"
      ],
      "line": 44,
      "id": "testing-the-primary-navigation-bar;click-all-links;;2"
    },
    {
      "cells": [
        "Client Services",
        "Client Services"
      ],
      "line": 45,
      "id": "testing-the-primary-navigation-bar;click-all-links;;3"
    },
    {
      "cells": [
        "Sectors",
        "Sectors"
      ],
      "line": 46,
      "id": "testing-the-primary-navigation-bar;click-all-links;;4"
    },
    {
      "cells": [
        "Find a Lawyer",
        "Find a Lawyer"
      ],
      "line": 47,
      "id": "testing-the-primary-navigation-bar;click-all-links;;5"
    },
    {
      "cells": [
        "Locations",
        "Locations"
      ],
      "line": 48,
      "id": "testing-the-primary-navigation-bar;click-all-links;;6"
    },
    {
      "cells": [
        "Insights",
        "Insights"
      ],
      "line": 49,
      "id": "testing-the-primary-navigation-bar;click-all-links;;7"
    },
    {
      "cells": [
        "Careers",
        "Careers"
      ],
      "line": 50,
      "id": "testing-the-primary-navigation-bar;click-all-links;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 20002938960,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 16611413946,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@Firefox"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 39,
  "name": "Clicking on the About Us link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Assert that the url contains About Us DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "About Us",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 5405638683,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "About Us",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 33312277,
  "status": "passed"
});
formatter.after({
  "duration": 915371110,
  "status": "passed"
});
formatter.before({
  "duration": 12341978051,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 13728692694,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@Firefox"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 39,
  "name": "Clicking on the Client Services link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Assert that the url contains Client Services DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Client Services",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 3113660088,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Client Services",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 74999183,
  "status": "passed"
});
formatter.after({
  "duration": 2065600525,
  "status": "passed"
});
formatter.before({
  "duration": 10905521880,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 9552216157,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@Firefox"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 39,
  "name": "Clicking on the Sectors link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Assert that the url contains Sectors DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sectors",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 4773078555,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sectors",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 43222310,
  "status": "passed"
});
formatter.after({
  "duration": 664356843,
  "status": "passed"
});
formatter.before({
  "duration": 12154694817,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 12692461296,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@Firefox"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 39,
  "name": "Clicking on the Find a Lawyer link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Assert that the url contains Find a Lawyer DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Find a Lawyer",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 2156461266,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find a Lawyer",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 103324443,
  "status": "passed"
});
formatter.after({
  "duration": 1066372386,
  "status": "passed"
});
formatter.before({
  "duration": 10752393186,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 12770598487,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@Firefox"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 39,
  "name": "Clicking on the Locations link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Assert that the url contains Locations DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Locations",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 3861465628,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Locations",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 84978339,
  "status": "passed"
});
formatter.after({
  "duration": 887714030,
  "status": "passed"
});
formatter.before({
  "duration": 10614973724,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 12929271014,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@Firefox"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 39,
  "name": "Clicking on the Insights link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Assert that the url contains Insights DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Insights",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 6592655670,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Insights",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 91438676,
  "status": "passed"
});
formatter.after({
  "duration": 647421978,
  "status": "passed"
});
formatter.before({
  "duration": 10036057313,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "The user is on the Linklaters.com homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefPrimaryNavigation.openOnLinksHomePage()"
});
formatter.result({
  "duration": 14439671620,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Click all links",
  "description": "",
  "id": "testing-the-primary-navigation-bar;click-all-links;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@Firefox"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 38,
      "value": "#This test uses a datatable to run through all of the titles"
    }
  ],
  "line": 39,
  "name": "Clicking on the Careers link in the primary navigation DT",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Assert that the url contains Careers DT",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Careers",
      "offset": 16
    }
  ],
  "location": "StepDefPrimaryNavigation.clickingAllLinksInPrimaryNav(String)"
});
formatter.result({
  "duration": 3717318301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Careers",
      "offset": 29
    }
  ],
  "location": "StepDefPrimaryNavigation.assertAllTitlesPrimaryNav(String)"
});
formatter.result({
  "duration": 57677108,
  "status": "passed"
});
formatter.after({
  "duration": 641382771,
  "status": "passed"
});
});