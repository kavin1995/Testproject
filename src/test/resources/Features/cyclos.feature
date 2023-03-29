
Feature: Verifying the cyclos page
@cyclos1
Scenario Outline: verify the cyclos in payment page

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click the submit button
And User should enter the value and click confirm button
Examples:
|User|pass|
|demo|1234|

@cyclos1
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment
Examples:
|User|pass|
|demo|1234|

@cyclos1
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payments
Examples:
|User|pass|
|demo|1234|

@cyclos1
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment mode
Examples:
|User|pass|
|demo|1234|

@cyclos1
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment modes
Examples:
|User|pass|
|demo|1234|

@cyclos2
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click Member account
Examples:
|User|pass|
|demo|1234|


@cyclos2
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click voucher
Examples:
|User|pass|
|demo|1234|


@cyclos2
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click theme
Examples:
|User|pass|
|demo|1234|


@cyclos2
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click banking
Examples:
|User|pass|
|demo|1234|

@cyclos2
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click market
Examples:
|User|pass|
|demo|1234|


@cyclos3
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click information
Examples:
|User|pass|
|demo|1234|


@cyclos3
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click demo
And User should quit browser
Examples:
|User|pass|
|demo|1234|


@cyclos3
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click demo
And User should click setting
Examples:
|User|pass|
|demo|1234|


@cyclos3
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click demo
And User should click contact
Examples:
|User|pass|
|demo|1234|


@cyclos3
Scenario Outline: verify the scheduled payments

Given User should lanch the url
When User should enter the "<User>" and "<pass>"
And User should click demo
And User should click password
Examples:
|User|pass|
|demo|1234|


