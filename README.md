# loyalty-airport-client

Loyalty Airport Experience API
- API version: 1.0.0
  - Build date: 2019-12-26T11:53:43.013-06:00[America/Chicago]
  
This repository showcases a reference implementation to use Loyalty Airport services API from [Mastercard Developers](https://developer.mastercard.com).

The Loyalty Airport Lounge APIs offers cardholders, via their issuers, the ability to  access the Mastercard Airport Lounge service through this digital channel.  Cardholders can search for airport lounges, get airport lounge details,  access airport lounges via their personalized Digital Membership Card,  and access their lounge history. These APIs can be used to build a rich,  interactive airport experience within the issuer's existing mobile application.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

#### Dependencies
1. [Mastercard client authentication library](https://github.com/Mastercard?&q=oauth). [for more info](https://github.com/Mastercard/oauth1-signer-java/blob/master/README.md)


## Getting Started

Please follow the [Steps to run the application from command line](#steps-to-run-the-application-from-command-line) to see how it works from command line.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.mastercard.developer</groupId>
  <artifactId>loyalty-airport-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mastercard.developer:loyalty-airport-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/loyalty-airport-client-1.0.0.jar`
* `target/lib/*.jar`


## Documentation for API Endpoints

All URIs are relative to *https://api.mastercard.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AirportApi* | [**loyaltyAirportDigitalMembershipCardsGet**](docs/AirportApi.md#loyaltyAirportDigitalMembershipCardsGet) | **GET** /loyalty/airport/digital-membership-cards | Get airport lounge digital membership card
*AirportApi* | [**loyaltyAirportEntitlementsGet**](docs/AirportApi.md#loyaltyAirportEntitlementsGet) | **GET** /loyalty/airport/entitlements | Get information about future personal and guest entitlements
*AirportApi* | [**loyaltyAirportLoungesGet**](docs/AirportApi.md#loyaltyAirportLoungesGet) | **GET** /loyalty/airport/lounges | Find airport lounges
*AirportApi* | [**loyaltyAirportLoungesLoungeCodeGet**](docs/AirportApi.md#loyaltyAirportLoungesLoungeCodeGet) | **GET** /loyalty/airport/lounges/{lounge_code} | Get airport lounge details
*AirportApi* | [**loyaltyAirportVisitsGet**](docs/AirportApi.md#loyaltyAirportVisitsGet) | **GET** /loyalty/airport/visits | Get airport lounge access history
*BundleProfileApi* | [**createUser**](docs/BundleProfileApi.md#createUser) | **POST** /bundle/profile/users | Create Profile
*BundleProfileApi* | [**patchUser**](docs/BundleProfileApi.md#patchUser) | **POST** /bundle/profile/users/{user_id}/patch | Partially Update Profile
*BundleProfileApi* | [**readConsent**](docs/BundleProfileApi.md#readConsent) | **GET** /bundle/profile/users/{user_id}/products/{product}/consents | Find Consent by Id and product
*BundleProfileApi* | [**readUser**](docs/BundleProfileApi.md#readUser) | **GET** /bundle/profile/users/{user_id} | Find User by Id


## Documentation for Models

 - [Account](docs/Account.md)
 - [Address](docs/Address.md)
 - [BundleUser](docs/BundleUser.md)
 - [BundleUserData](docs/BundleUserData.md)
 - [BundleUserPatch](docs/BundleUserPatch.md)
 - [BundleUserResponse](docs/BundleUserResponse.md)
 - [BundleUserResponseData](docs/BundleUserResponseData.md)
 - [BundleUserResponseErrors](docs/BundleUserResponseErrors.md)
 - [Consent](docs/Consent.md)
 - [Email](docs/Email.md)
 - [Error](docs/Error.md)
 - [ErrorItem](docs/ErrorItem.md)
 - [ErrorItems](docs/ErrorItems.md)
 - [ErrorItemsErrors](docs/ErrorItemsErrors.md)
 - [Errors](docs/Errors.md)
 - [ErrorsErrors](docs/ErrorsErrors.md)
 - [Identification](docs/Identification.md)
 - [Im](docs/Im.md)
 - [IsRegistered](docs/IsRegistered.md)
 - [Lounge](docs/Lounge.md)
 - [LoungeAirport](docs/LoungeAirport.md)
 - [LoungeAirportImage](docs/LoungeAirportImage.md)
 - [LoungeAmenity](docs/LoungeAmenity.md)
 - [LoungeDMC](docs/LoungeDMC.md)
 - [LoungeDMCMedia](docs/LoungeDMCMedia.md)
 - [LoungeDetail](docs/LoungeDetail.md)
 - [LoungeEntitlement](docs/LoungeEntitlement.md)
 - [LoungeHistoryItem](docs/LoungeHistoryItem.md)
 - [LoungeImage](docs/LoungeImage.md)
 - [LoungeVisitEntitlement](docs/LoungeVisitEntitlement.md)
 - [Name](docs/Name.md)
 - [PatchDocument](docs/PatchDocument.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [Photo](docs/Photo.md)
 - [User](docs/User.md)
 - [UserProduct](docs/UserProduct.md)
 - [UserProductResponse](docs/UserProductResponse.md)
 - [UserReadAccountResponse](docs/UserReadAccountResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

loyalty-benefits-support@mastercard.flowdock.com

# Steps to run the application from command line
              
- Create a new project from Mastercard DevZone - stage.developer.mastercard.com or developer.mastercard.com
- Select "Loyalty Airport" from Choose API dropdown and hit continue.
- Get Sandbox keys and store your .p12 certificate along with the readme/documentation.
- Please save this Sandbox Keys, .p12, key store password and alias as you are going to use these to run the application.
- Clone this repository and set up as Maven project
- Update the following keys in application.properties file
    - *mastercard.airport.ref.app.consumer.key*: This can be found in the project you created on developerZone
    - *mastercard.airport.ref.app.keystore.path*: Path where you saved your certs i.e., .p12 file you received while creating a project
    - *mastercard.airport.ref.app.keystore.password*: This is the password you get with Sandbox cert.
    - *mastercard.airport.ref.app.keystore.alias*: This is the alias you get with Sandbox cert.
    
- Example:
    - mastercard.airport.ref.app.url = https://stage.api.mastercard.com
    - mastercard.airport.ref.app.consumer.key = Abcdfefgjhilklmnopqrstuvwxyz-dxcq_zD7IiPa0df175e!22a7fddba56e800000000000000000
    - mastercard.airport.ref.app.keystore.path = C:\\path\\provided.p12
    - mastercard.airport.ref.app.keystore.password = pwd
    - mastercard.airport.ref.app.keystore.alias = alias

	
- Do a clean build either through IDE or command prompt, if you are doing it through command prompt then the below command should be executed in the directory which contains this repository's pom file
    Eg: mvn clean install
- Run the application using below command 
    - Eg: `java -jar path of the Jar relative to the current directory/loyalty-airport-client-1.0.0.jar <argument>`
    - Argument: An argument which defines the feature user wants to run through command line. If you don't specify this argument, it will run all the features(registration,lounges,loungeDetails,dmc,entitlement and loungeHistory, error) one after the other
        - registration : Registration for airport service
        - lounges : Find airport lounges
        - loungeDetails : Get airport lounge details
        - dmc : Get the digital membership card to access the lounge
        - entitlement : Get information about future personal and guest entitlements
        - loungeHistory: Get airport lounge access history 
        - error: An error scenario example         
               
- Command line example to run the application: 
    - `java -jar target/loyalty-airport-client-1.0.0.jar dmc` here the application runs only dmc feature. if you want to run more than one feature then specify the features with comma separated. Eg: `java -jar target/loyalty-airport-client-1.0.0.jar dmc,registration,error` here it executes only these 3 features.You can remove the argument to run all the features Eg: `java -jar target/loyalty-airport-client-1.0.0.jar`. If you want to run the feature one by one then execute the command `java -jar target/loyalty-airport-client-1.0.0.jar dmc` then again run the command with different feature `java -jar target/loyalty-airport-client-1.0.0.jar lounges` and so on.
    
# Sandbox Testing
    
If you would like to test this in Sandbox environment please contact Mastercard representative to set up you or your organization in this environment because if this does not happen the authorization fails in the Loyalty Airport Service API. All the URLs have a prefix `reference` in this reference application for all resources of Loyalty Airport Service API so that it deals with sample data. You need to remove this `reference` word from the URLs when testing against real data. Eg: `/loyalty/airport/reference` just for reference application and `/loyalty/airport` to test against real data. 

While testing the application with a `reference(/loyalty/airport/reference)` url you need to send the exact inputs that are used in this reference app to get the desired response otherwise the mock returns an error with a message 'the request does not match'.


    
 
Find the [service documentation](https://developer.mastercard.com/documentation/loyalty-airport) for more information. 

Client libraries can be generated for a simplified integration with the reference service, [for more details](https://developer.mastercard.com/blog/consuming-mastercard-apis-in-client-applications)


Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.    

