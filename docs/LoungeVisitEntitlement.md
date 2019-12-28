
# LoungeVisitEntitlement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**total** | **Integer** | Total entitlements |  [optional]
**used** | **Integer** | Entitlements used |  [optional]
**pending** | **Integer** | Entitlements pending (before being processed) |  [optional]
**remaining** | **Integer** | Entitlements remaining |  [optional]
**chargeFee** | **Integer** | Fee required (if any) |  [optional]
**chargeCurrency** | **String** | 3 digit ISO currency code |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LIMITEDENTITLEMENTS | &quot;LimitedEntitlements&quot;
UNLIMITEDENTITLEMENTS | &quot;UnlimitedEntitlements&quot;
NOENTITLEMENTS | &quot;NoEntitlements&quot;



