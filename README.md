# vocalink-modcheck
Java Implementation of VocaLink ModulusCheck that has 3 algorithm Mod10, Mod11 and DBLAL.
Vocalink is a payment systems company based in UK and they provide payment infrastructure to UK payments system including BACS scheme. 
Vocalink also proposes modulus check for account number based upon sortcodes (SC) for each bank, this ModulusCheck is based upon follwoing specification : 
http://www.vocalink.com/media/617404/vocalink_-_validating_account_numbers_v3.00.pdf
where in modulus weights are provided and based upon that an account number is validated applying Mod10, Mod11 and DBLAL check against each range of sortcode. 

This is Java implementation of Vocalink Moduluscheck and fully supports 3.0 specification (latest as of this writing). 

The application can be access from here : https://vocalinkmoduluschecker.herokuapp.com/ 
It uses React on front end and Spring boot on backend. 
