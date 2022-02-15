package com.williamdsw.jaxws.services;

public class PersonServiceProxy implements com.williamdsw.jaxws.services.PersonService {
  private String _endpoint = null;
  private com.williamdsw.jaxws.services.PersonService personService = null;

  public PersonServiceProxy() {
    _initPersonServiceProxy();
  }

  public PersonServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonServiceProxy();
  }

  private void _initPersonServiceProxy() {
    try {
      personService = (new com.williamdsw.jaxws.services.PersonServiceServiceLocator()).getPersonService();
      if (personService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub) personService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String) ((javax.xml.rpc.Stub) personService)
              ._getProperty("javax.xml.rpc.service.endpoint.address");
      }

    } catch (javax.xml.rpc.ServiceException serviceException) {
    }
  }

  public String getEndpoint() {
    return _endpoint;
  }

  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personService != null)
      ((javax.xml.rpc.Stub) personService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

  }

  public com.williamdsw.jaxws.services.PersonService getPersonService() {
    if (personService == null)
      _initPersonServiceProxy();
    return personService;
  }

  public boolean addPerson(com.williamdsw.jaxws.beans.Person person) throws java.rmi.RemoteException {
    if (personService == null)
      _initPersonServiceProxy();
    return personService.addPerson(person);
  }

  public boolean deletePerson(int id) throws java.rmi.RemoteException {
    if (personService == null)
      _initPersonServiceProxy();
    return personService.deletePerson(id);
  }

  public com.williamdsw.jaxws.beans.Person[] getAllPersons() throws java.rmi.RemoteException {
    if (personService == null)
      _initPersonServiceProxy();
    return personService.getAllPersons();
  }

  public com.williamdsw.jaxws.beans.Person getPerson(int id) throws java.rmi.RemoteException {
    if (personService == null)
      _initPersonServiceProxy();
    return personService.getPerson(id);
  }

}