/*
 * 
 * 
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
 * 
 */
package com.mastercard.developer.loyalty_airport_client.model;

public class AccountExternal {
	
	private String accountStatusCode;
	
	private String externalMembershipReferenceId;

	public String getAccountStatusCode() {
		return accountStatusCode;
	}

	public void setAccountStatusCode(String accountStatusCode) {
		this.accountStatusCode = accountStatusCode;
	}

	public String getExternalMembershipReferenceId() {
		return externalMembershipReferenceId;
	}

	public void setExternalMembershipReferenceId(String externalMembershipReferenceId) {
		this.externalMembershipReferenceId = externalMembershipReferenceId;
	}
	
	

}
