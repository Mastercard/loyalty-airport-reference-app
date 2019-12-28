# AirportApi

All URIs are relative to *https://api.mastercard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loyaltyAirportDigitalMembershipCardsGet**](AirportApi.md#loyaltyAirportDigitalMembershipCardsGet) | **GET** /loyalty/airport/digital-membership-cards | Get airport lounge digital membership card
[**loyaltyAirportEntitlementsGet**](AirportApi.md#loyaltyAirportEntitlementsGet) | **GET** /loyalty/airport/entitlements | Get information about future personal and guest entitlements
[**loyaltyAirportLoungesGet**](AirportApi.md#loyaltyAirportLoungesGet) | **GET** /loyalty/airport/lounges | Find airport lounges
[**loyaltyAirportLoungesLoungeCodeGet**](AirportApi.md#loyaltyAirportLoungesLoungeCodeGet) | **GET** /loyalty/airport/lounges/{lounge_code} | Get airport lounge details
[**loyaltyAirportVisitsGet**](AirportApi.md#loyaltyAirportVisitsGet) | **GET** /loyalty/airport/visits | Get airport lounge access history


<a name="loyaltyAirportDigitalMembershipCardsGet"></a>
# **loyaltyAirportDigitalMembershipCardsGet**
> LoungeDMC loyaltyAirportDigitalMembershipCardsGet(userId, panLastFourDigits)

Get airport lounge digital membership card

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_airport_client.ApiException;
//import com.mastercard.developer.loyalty_airport_client.api.AirportApi;


AirportApi apiInstance = new AirportApi();
String userId = user1235; // String | Opaque identifier for the consumer. This is the same userId used while enrolling for airport via Bundle Profile API.
String panLastFourDigits = 2244; // String | Last four digits of user's registered 16 digit credit card number
try {
    LoungeDMC result = apiInstance.loyaltyAirportDigitalMembershipCardsGet(userId, panLastFourDigits);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AirportApi#loyaltyAirportDigitalMembershipCardsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Opaque identifier for the consumer. This is the same userId used while enrolling for airport via Bundle Profile API. |
 **panLastFourDigits** | **String**| Last four digits of user&#39;s registered 16 digit credit card number |

### Return type

[**LoungeDMC**](LoungeDMC.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loyaltyAirportEntitlementsGet"></a>
# **loyaltyAirportEntitlementsGet**
> List&lt;LoungeEntitlement&gt; loyaltyAirportEntitlementsGet(userId, panLastFourDigits)

Get information about future personal and guest entitlements

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_airport_client.ApiException;
//import com.mastercard.developer.loyalty_airport_client.api.AirportApi;


AirportApi apiInstance = new AirportApi();
String userId = user1235; // String | Opaque identifier for the consumer. This is the same userId used while enrolling for airport via Bundle Profile API.
String panLastFourDigits = 2244; // String | Last four digits of user's registered 16 digit credit card number
try {
    List<LoungeEntitlement> result = apiInstance.loyaltyAirportEntitlementsGet(userId, panLastFourDigits);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AirportApi#loyaltyAirportEntitlementsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Opaque identifier for the consumer. This is the same userId used while enrolling for airport via Bundle Profile API. |
 **panLastFourDigits** | **String**| Last four digits of user&#39;s registered 16 digit credit card number |

### Return type

[**List&lt;LoungeEntitlement&gt;**](LoungeEntitlement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loyaltyAirportLoungesGet"></a>
# **loyaltyAirportLoungesGet**
> List&lt;LoungeAirport&gt; loyaltyAirportLoungesGet(userId, panLastFourDigits, searchText, preferredLanguage)

Find airport lounges

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_airport_client.ApiException;
//import com.mastercard.developer.loyalty_airport_client.api.AirportApi;


AirportApi apiInstance = new AirportApi();
String userId = user1235; // String | Opaque identifier for the consumer. This is the same userId used while enrolling for airport via Bundle Profile API.
String panLastFourDigits = 2244; // String | Last four digits of user's registered 16 digit credit card number
String searchText = LON; // String | Free search text. Can be country name, country code, city name, airport name, airport code, or MCAE lounge code. Min Length: 3
String preferredLanguage = en-GB; // String | User's preferred language in localized ISO 639-1 format such as pt-BR
try {
    List<LoungeAirport> result = apiInstance.loyaltyAirportLoungesGet(userId, panLastFourDigits, searchText, preferredLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AirportApi#loyaltyAirportLoungesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Opaque identifier for the consumer. This is the same userId used while enrolling for airport via Bundle Profile API. |
 **panLastFourDigits** | **String**| Last four digits of user&#39;s registered 16 digit credit card number |
 **searchText** | **String**| Free search text. Can be country name, country code, city name, airport name, airport code, or MCAE lounge code. Min Length: 3 |
 **preferredLanguage** | **String**| User&#39;s preferred language in localized ISO 639-1 format such as pt-BR |

### Return type

[**List&lt;LoungeAirport&gt;**](LoungeAirport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loyaltyAirportLoungesLoungeCodeGet"></a>
# **loyaltyAirportLoungesLoungeCodeGet**
> LoungeDetail loyaltyAirportLoungesLoungeCodeGet(loungeCode, userId, panLastFourDigits, preferredLanguage)

Get airport lounge details

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_airport_client.ApiException;
//import com.mastercard.developer.loyalty_airport_client.api.AirportApi;


AirportApi apiInstance = new AirportApi();
String loungeCode = LGW1; // String | A unique ID that corresponds to a lounge and can be retrived from lounges search response
String userId = user1235; // String | Opaque identifier for the consumer. This is the same userId used while enrolling for airport via Bundle Profile API.
String panLastFourDigits = 2244; // String | Last four digits of user's registered 16 digit credit card number
String preferredLanguage = pt-BR; // String | User's preferred language in localized ISO 639-1 format such as pt-BR
try {
    LoungeDetail result = apiInstance.loyaltyAirportLoungesLoungeCodeGet(loungeCode, userId, panLastFourDigits, preferredLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AirportApi#loyaltyAirportLoungesLoungeCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loungeCode** | **String**| A unique ID that corresponds to a lounge and can be retrived from lounges search response |
 **userId** | **String**| Opaque identifier for the consumer. This is the same userId used while enrolling for airport via Bundle Profile API. |
 **panLastFourDigits** | **String**| Last four digits of user&#39;s registered 16 digit credit card number |
 **preferredLanguage** | **String**| User&#39;s preferred language in localized ISO 639-1 format such as pt-BR |

### Return type

[**LoungeDetail**](LoungeDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loyaltyAirportVisitsGet"></a>
# **loyaltyAirportVisitsGet**
> List&lt;LoungeHistoryItem&gt; loyaltyAirportVisitsGet(userId, panLastFourDigits, preferredLanguage, transactionDateFrom, transactionDateTo)

Get airport lounge access history

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_airport_client.ApiException;
//import com.mastercard.developer.loyalty_airport_client.api.AirportApi;


AirportApi apiInstance = new AirportApi();
String userId = user1235; // String | Opaque identifier for the consumer. This is the same userId used while enrolling for airport via Bundle Profile API.
String panLastFourDigits = 2244; // String | Last four digits of user's registered 16 digit credit card number
String preferredLanguage = pt-BR; // String | User's preferred language in localized ISO 639-1 format such as pt-BR
String transactionDateFrom = 2018-01-31T00:00:00Z; // String | visits can be filtered starting from this specified date
String transactionDateTo = 2018-06-31T24:59:59Z; // String | visits can be filtered upto this specified date
try {
    List<LoungeHistoryItem> result = apiInstance.loyaltyAirportVisitsGet(userId, panLastFourDigits, preferredLanguage, transactionDateFrom, transactionDateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AirportApi#loyaltyAirportVisitsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Opaque identifier for the consumer. This is the same userId used while enrolling for airport via Bundle Profile API. |
 **panLastFourDigits** | **String**| Last four digits of user&#39;s registered 16 digit credit card number |
 **preferredLanguage** | **String**| User&#39;s preferred language in localized ISO 639-1 format such as pt-BR |
 **transactionDateFrom** | **String**| visits can be filtered starting from this specified date | [optional]
 **transactionDateTo** | **String**| visits can be filtered upto this specified date | [optional]

### Return type

[**List&lt;LoungeHistoryItem&gt;**](LoungeHistoryItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

