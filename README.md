1.Change access modifier to static for logger  MobileNumberUtils.java
2.changed from interface @PreInsert to @PrePersist  in JPA we use either @PrePersist or PreUpdate

3. EnquiriesServiceImpl.java
  Line 36 Fix: change from persist to save 
  Line 39 Fix: change from update to save

 When persisting we call save method


4. CreditServiceImpl.java
  Line 38 Fix: change from persist to save 
  Line 41 Fix: change from update to save

5. PartnerCodeValidatorImp.java
   super type constructor not needed

6. com.econetwireless.epay.domain;

Caused by: org.hibernate.HibernateException: Errors in named queries: SubscriberRequest.findByPartnerCode

Fix: match table_name to entity name in NamedQuery



7.Fix: Binding partnecode to partnerCode @WebParam(name=“partnerCode”)- IntelligentNetworkService.java 
  Fix:Change @BindingType(value = SOAPBinding.SOAP11HTTP_BINDING)- IntelligentNetworkServiceImp.java
