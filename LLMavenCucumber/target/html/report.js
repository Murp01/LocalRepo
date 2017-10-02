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
  "duration": 10220047656,
  "status": "passed"
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.opens_the_form()"
});
formatter.result({
  "duration": 254727,
  "status": "passed"
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.completes_all_mandatory_fields()"
});
formatter.result({
  "duration": 152324,
  "status": "passed"
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.clicks_submite()"
});
formatter.result({
  "duration": 138244,
  "status": "passed"
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.the_form_will_send()"
});
formatter.result({
  "duration": 151684,
  "status": "passed"
});
formatter.match({
  "location": "StepDefNewsletterSignUpForm.a_success_message_will_appear()"
});
formatter.result({
  "duration": 185606,
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
  "duration": 4993302856,
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
  "duration": 11979735762,
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
  "duration": 4392785850,
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
  "duration": 57796151,
  "status": "passed"
});
formatter.after({
  "duration": 781763594,
  "status": "passed"
});
formatter.before({
  "duration": 4319575514,
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
  "duration": 6335986206,
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
  "duration": 3884668826,
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
  "duration": 35955550,
  "status": "passed"
});
formatter.after({
  "duration": 2336128930,
  "status": "passed"
});
formatter.before({
  "duration": 4611269302,
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
  "duration": 8760014516,
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
  "duration": 3603953901,
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
  "duration": 47203860,
  "status": "passed"
});
formatter.after({
  "duration": 493974554,
  "status": "passed"
});
formatter.before({
  "duration": 4178863802,
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
  "duration": 8058620493,
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
  "duration": 2060335100,
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
  "duration": 38536101,
  "status": "passed"
});
formatter.after({
  "duration": 569087662,
  "status": "passed"
});
formatter.before({
  "duration": 3606085800,
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
  "duration": 8859185245,
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
  "duration": 2507385483,
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
  "duration": 30350915,
  "status": "passed"
});
formatter.after({
  "duration": 491378002,
  "status": "passed"
});
formatter.before({
  "duration": 4460225785,
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
  "duration": 7394272610,
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
  "duration": 3164443566,
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
  "duration": 58971863,
  "status": "passed"
});
formatter.after({
  "duration": 513042599,
  "status": "passed"
});
formatter.before({
  "duration": 3864263144,
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
  "duration": 7780184671,
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
  "duration": 3728064837,
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
  "duration": 50562032,
  "status": "passed"
});
formatter.after({
  "duration": 556476114,
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
  "duration": 17434568759,
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
  "duration": 15393592271,
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
  "duration": 4110574563,
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
  "duration": 149436432,
  "status": "passed"
});
formatter.after({
  "duration": 851521034,
  "status": "passed"
});
formatter.before({
  "duration": 12546331195,
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
  "duration": 15391730461,
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
  "duration": 3238152474,
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
  "duration": 142912092,
  "status": "passed"
});
formatter.after({
  "duration": 1121374220,
  "status": "passed"
});
formatter.before({
  "duration": 12768631713,
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
  "duration": 14415913526,
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
  "duration": 3761901928,
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
  "duration": 68796773,
  "status": "passed"
});
formatter.after({
  "duration": 1017079510,
  "status": "passed"
});
formatter.before({
  "duration": 11668617440,
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
  "duration": 11296604003,
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
  "duration": 3287317987,
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
  "duration": 65559564,
  "status": "passed"
});
formatter.after({
  "duration": 616725452,
  "status": "passed"
});
formatter.before({
  "duration": 10004736770,
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
  "duration": 13037943444,
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
  "duration": 3585134183,
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
  "duration": 186659216,
  "status": "passed"
});
formatter.after({
  "duration": 933484249,
  "status": "passed"
});
formatter.before({
  "duration": 10621807192,
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
  "duration": 14103248922,
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
  "duration": 6581187834,
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
  "duration": 117023380,
  "status": "passed"
});
formatter.after({
  "duration": 672842837,
  "status": "passed"
});
formatter.before({
  "duration": 10941981764,
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
  "duration": 14405522839,
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
  "duration": 4617544675,
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
  "duration": 65638286,
  "status": "passed"
});
formatter.after({
  "duration": 604613759,
  "status": "passed"
});
});