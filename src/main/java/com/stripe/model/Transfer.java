package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

public class Transfer extends APIResource implements MetadataStore<Transfer>, HasId {
  String id;
  String object;
  Long amount;
  Long amountReversed;
  String applicationFee;
  ExpandableField<BalanceTransaction> balanceTransaction;
  BankAccount bankAccount;
  Long created;
  String currency;
  Long date;
  String description;
  ExpandableField<Account> destination;
  ExpandableField<Charge> destinationPayment;
  String failureCode;
  String failureMessage;
  Boolean livemode;
  Map<String, String> metadata;
  TransferReversalCollection reversals;
  Boolean reversed;
  ExpandableField<Charge> sourceTransaction;
  String sourceType;
  String statementDescriptor;
  String status;
  String transferGroup;
  String type;

  @Deprecated
  BankAccount account;
  @Deprecated
  List<String> otherTransfers;
  @Deprecated
  String recipient;
  @Deprecated
  String statementDescription;
  @Deprecated
  Summary summary;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getAmountReversed() {
    return amountReversed;
  }

  public void setAmountReversed(Long amountReversed) {
    this.amountReversed = amountReversed;
  }

  @Deprecated
  public String getApplicationFee() {
    return applicationFee;
  }

  @Deprecated
  public void setApplicationFee(String applicationFee) {
    this.applicationFee = applicationFee;
  }

  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String balanceTransactionID) {
    this.balanceTransaction = setExpandableFieldID(balanceTransactionID, this.balanceTransaction);
  }

  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction c) {
    this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
  }

  @Deprecated
  public BankAccount getBankAccount() {
    return bankAccount;
  }

  @Deprecated
  public void setBankAccount(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  @Deprecated
  public String getDescription() {
    return description;
  }

  @Deprecated
  public void setDescription(String description) {
    this.description = description;
  }

  public String getDestination() {
    return (this.destination != null) ? this.destination.getId() : null;
  }

  public void setDestination(String destinationID) {
    this.destination = APIResource.setExpandableFieldID(destinationID, this.destination);
  }

  public Account getDestinationObject() {
    return (this.destination != null) ? this.destination.getExpanded() : null;
  }

  public void setDestinationObject(Account c) {
    this.destination = new ExpandableField<Account>(c.getId(), c);
  }

  public String getDestinationPayment() {
    return (this.destinationPayment != null) ? this.destinationPayment.getId() : null;
  }

  public void setDestinationPayment(String destinationPaymentID) {
    this.destinationPayment = setExpandableFieldID(destinationPaymentID, this.destinationPayment);
  }

  public Charge getDestinationPaymentObject() {
    return (this.destinationPayment != null) ? this.destinationPayment.getExpanded() : null;
  }

  public void setDestinationPaymentObject(Charge destinationPayment) {
    this.destinationPayment
        = new ExpandableField<Charge>(destinationPayment.getId(), destinationPayment);
  }

  @Deprecated
  public String getFailureCode() {
    return failureCode;
  }

  @Deprecated
  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }

  @Deprecated
  public String getFailureMessage() {
    return failureMessage;
  }

  @Deprecated
  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }

  public Boolean getLivemode() {
    return livemode;
  }

  public void setLivemode(Boolean livemode) {
    this.livemode = livemode;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  /**
   * Returns the {@code reversals} list.
   *
   * @return the {@code reversals} list
   */
  public TransferReversalCollection getReversals() {
    if (reversals.getURL() == null) {
      reversals.setURL(String.format("/v1/transfers/%s/reversals", getId()));
    }
    return reversals;
  }

  public Boolean getReversed() {
    return reversed;
  }

  public void setReversed(Boolean reversed) {
    this.reversed = reversed;
  }

  public String getSourceTransaction() {
    return (this.sourceTransaction != null) ? this.sourceTransaction.getId() : null;
  }

  public void setSourceTransaction(String sourceTransactionID) {
    this.sourceTransaction = setExpandableFieldID(sourceTransactionID, this.sourceTransaction);

  }

  public Charge getSourceTransactionObject() {
    return (this.sourceTransaction != null) ? this.sourceTransaction.getExpanded() : null;
  }

  public void setSourceTransactionObject(Charge sourceTransaction) {
    this.sourceTransaction
        = new ExpandableField<Charge>(sourceTransaction.getId(), sourceTransaction);
  }

  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public String getStatementDescriptor() {
    return statementDescriptor;
  }

  public void setStatementDescriptor(String statementDescriptor) {
    this.statementDescriptor = statementDescriptor;
  }

  @Deprecated
  public String getStatus() {
    return status;
  }

  @Deprecated
  public void setStatus(String status) {
    this.status = status;
  }

  public String getTransferGroup() {
    return this.transferGroup;
  }

  public void setTransferGroup(String transferGroup) {
    this.transferGroup = transferGroup;
  }

  @Deprecated
  public String getType() {
    return type;
  }

  @Deprecated
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Returns the {@code account} attribute.
   *
   * @return the {@code account} attribute
   * @deprecated Prefer using the {@code bank_account} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-05-19">API version 2014-05-19</a>
   */
  @Deprecated
  public BankAccount getAccount() {
    return account;
  }

  @Deprecated
  public void setAccount(BankAccount account) {
    this.account = account;
  }

  /**
   * Returns the {@code other_transfers} attribute.
   *
   * @return the {@code other_transfers} attribute
   * @deprecated Prefer using the {@link BalanceTransaction#list} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-08-04">API version 2014-08-04</a>
   */
  @Deprecated
  public List<String> getOtherTransfers() {
    return otherTransfers;
  }

  @Deprecated
  public void setOtherTransfers(List<String> otherTransfers) {
    this.otherTransfers = otherTransfers;
  }

  @Deprecated
  public String getRecipient() {
    return recipient;
  }

  @Deprecated
  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  /**
   * Returns the {@code statement_description} attribute.
   *
   * @return the {@code statement_description} attribute
   * @deprecated Prefer using the {@code statement_descriptor} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-12-17">API version 2014-12-17</a>
   */
  @Deprecated
  public String getStatementDescription() {
    return statementDescription;
  }

  @Deprecated
  public void setStatementDescription(String statementDescription) {
    this.statementDescription = statementDescription;
  }

  /**
   * Returns the {@code summary} attribute.
   *
   * @return the {@code summary} attribute
   * @deprecated Prefer using the {@link BalanceTransaction#list} method instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-08-04">API version 2014-08-04</a>
   */
  @Deprecated
  public Summary getSummary() {
    return summary;
  }

  @Deprecated
  public void setSummary(Summary summary) {
    this.summary = summary;
  }

  public static Transfer create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, (RequestOptions) null);
  }

  @Deprecated
  public static Transfer create(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Transfer create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Transfer.class), params, Transfer.class, options);
  }

  public static Transfer retrieve(String id) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return retrieve(id, (RequestOptions) null);
  }

  @Deprecated
  public static Transfer retrieve(String id, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public static Transfer retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Transfer.class, id), null, Transfer.class,
        options);
  }

  public static Transfer retrieve(String id, Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Transfer.class, id), params, Transfer.class,
        options);
  }

  /**
   * Returns the {@code summary} attribute.
   *
   * @return the {@code summary} attribute
   * @deprecated Prefer using the {@code transfers.getReversals().create(params)} method instead.
   */
  @Deprecated
  public Transfer cancel()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancel((RequestOptions) null);
  }

  @Deprecated
  public Transfer cancel(String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return cancel(RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Transfer cancel(RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Transfer.class, this.id) + "/cancel", null,
        Transfer.class, options);
  }

  public Transfer update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  @Deprecated
  public Transfer update(Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public Transfer update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, instanceURL(Transfer.class, this.id), params,
        Transfer.class, options);
  }

  public TransferTransactionCollection transactions(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return transactions(params, (RequestOptions) null);
  }

  @Deprecated
  public TransferTransactionCollection transactions(
      Map<String, Object> params, String apiKey)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return transactions(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  public TransferTransactionCollection transactions(
      Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    String url = String.format("%s%s", instanceURL(Transfer.class, this.getId()), "/transactions");
    return requestCollection(url, params, TransferTransactionCollection.class, options);
  }

  public static TransferCollection list(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  public static TransferCollection list(Map<String, Object> params,
                      RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return requestCollection(classURL(Transfer.class), params, TransferCollection.class, options);
  }

  @Deprecated
  public static TransferCollection all(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return list(params, null);
  }

  @Deprecated
  public static TransferCollection all(Map<String, Object> params,
                     String apiKey) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, RequestOptions.builder().setApiKey(apiKey).build());
  }

  @Deprecated
  public static TransferCollection all(Map<String, Object> params,
                     RequestOptions options) throws AuthenticationException,
      InvalidRequestException, APIConnectionException, CardException,
      APIException {
    return list(params, options);
  }
}
