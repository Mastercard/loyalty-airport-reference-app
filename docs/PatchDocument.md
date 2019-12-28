
# PatchDocument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | [**OpEnum**](#OpEnum) | The operation to be performed | 
**path** | **String** | JSONPath | 
**from** | **String** | A string containing a JSON Pointer value. |  [optional]
**value** | [**Object**](.md) | The value to be used within the operations. |  [optional]


<a name="OpEnum"></a>
## Enum: OpEnum
Name | Value
---- | -----
ADD | &quot;add&quot;
REMOVE | &quot;remove&quot;
REPLACE | &quot;replace&quot;



