# BundleProfileApi

All URIs are relative to *https://api.mastercard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](BundleProfileApi.md#createUser) | **POST** /bundle/profile/users | Create Profile
[**patchUser**](BundleProfileApi.md#patchUser) | **POST** /bundle/profile/users/{user_id}/patch | Partially Update Profile
[**readConsent**](BundleProfileApi.md#readConsent) | **GET** /bundle/profile/users/{user_id}/products/{product}/consents | Find Consent by Id and product
[**readUser**](BundleProfileApi.md#readUser) | **GET** /bundle/profile/users/{user_id} | Find User by Id


<a name="createUser"></a>
# **createUser**
> BundleUserResponse createUser(bundleUser)

Create Profile

Create Profile user and associated product service(s) consents and card account(s)

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_airport_client.ApiException;
//import com.mastercard.developer.loyalty_airport_client.api.BundleProfileApi;


BundleProfileApi apiInstance = new BundleProfileApi();
BundleUser bundleUser = new BundleUser(); // BundleUser | Bundle Profile body
try {
    BundleUserResponse result = apiInstance.createUser(bundleUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundleProfileApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleUser** | [**BundleUser**](BundleUser.md)| Bundle Profile body |

### Return type

[**BundleUserResponse**](BundleUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchUser"></a>
# **patchUser**
> BundleUserResponse patchUser(userId, bundleUserPatch)

Partially Update Profile

Partial updates of Profile user and associated product service(s) consents and card account(s)

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_airport_client.ApiException;
//import com.mastercard.developer.loyalty_airport_client.api.BundleProfileApi;


BundleProfileApi apiInstance = new BundleProfileApi();
String userId = "userId_example"; // String | Opaque identifier for the consumer. Issuer/Acquirer to send it complies to IETF RFC2396; MC provisions it depends on the use case, such as user123-partnerBank
BundleUserPatch bundleUserPatch = new BundleUserPatch(); // BundleUserPatch | Bundle Profile body
try {
    BundleUserResponse result = apiInstance.patchUser(userId, bundleUserPatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundleProfileApi#patchUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Opaque identifier for the consumer. Issuer/Acquirer to send it complies to IETF RFC2396; MC provisions it depends on the use case, such as user123-partnerBank |
 **bundleUserPatch** | [**BundleUserPatch**](BundleUserPatch.md)| Bundle Profile body |

### Return type

[**BundleUserResponse**](BundleUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readConsent"></a>
# **readConsent**
> BundleUserResponse readConsent(userId, product)

Find Consent by Id and product

Returns a Consent on the basis of provided id, product as path params (https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.1)

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_airport_client.ApiException;
//import com.mastercard.developer.loyalty_airport_client.api.BundleProfileApi;


BundleProfileApi apiInstance = new BundleProfileApi();
String userId = "userId_example"; // String | Opaque identifier for the consumer. Issuer/Acquirer to send it complies to IETF RFC2396; MC provisions it depends on the use case. Ex - User123Z
String product = "product_example"; // String | product identifier
try {
    BundleUserResponse result = apiInstance.readConsent(userId, product);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundleProfileApi#readConsent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Opaque identifier for the consumer. Issuer/Acquirer to send it complies to IETF RFC2396; MC provisions it depends on the use case. Ex - User123Z |
 **product** | **String**| product identifier |

### Return type

[**BundleUserResponse**](BundleUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readUser"></a>
# **readUser**
> BundleUserResponse readUser(userId)

Find User by Id

Returns a Users on the basis of provided id as path param (https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.1)

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_airport_client.ApiException;
//import com.mastercard.developer.loyalty_airport_client.api.BundleProfileApi;


BundleProfileApi apiInstance = new BundleProfileApi();
String userId = "userId_example"; // String | Opaque identifier for the consumer. Issuer/Acquirer to send it complies to IETF RFC2396; MC provisions it depends on the use case, such as user123-partnerBank
try {
    BundleUserResponse result = apiInstance.readUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BundleProfileApi#readUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Opaque identifier for the consumer. Issuer/Acquirer to send it complies to IETF RFC2396; MC provisions it depends on the use case, such as user123-partnerBank |

### Return type

[**BundleUserResponse**](BundleUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

