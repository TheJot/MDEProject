/**
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.generateMe.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.juliusz.generateme.generateMe.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.juliusz.generateme.generateMe.GenerateMePackage
 * @generated
 */
public class GenerateMeSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GenerateMePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenerateMeSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GenerateMePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GenerateMePackage.GENERATE_ME_PROGRAM:
      {
        GenerateMeProgram generateMeProgram = (GenerateMeProgram)theEObject;
        T result = caseGenerateMeProgram(generateMeProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GenerateMePackage.CONFIG:
      {
        Config config = (Config)theEObject;
        T result = caseConfig(config);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GenerateMePackage.HOME_PAGE:
      {
        HomePage homePage = (HomePage)theEObject;
        T result = caseHomePage(homePage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GenerateMePackage.PAGES:
      {
        Pages pages = (Pages)theEObject;
        T result = casePages(pages);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GenerateMePackage.CONTENT_PAGE:
      {
        ContentPage contentPage = (ContentPage)theEObject;
        T result = caseContentPage(contentPage);
        if (result == null) result = casePages(contentPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GenerateMePackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GenerateMePackage.CONTACT_PAGE:
      {
        ContactPage contactPage = (ContactPage)theEObject;
        T result = caseContactPage(contactPage);
        if (result == null) result = casePages(contactPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GenerateMePackage.GALLERY_PAGE:
      {
        GalleryPage galleryPage = (GalleryPage)theEObject;
        T result = caseGalleryPage(galleryPage);
        if (result == null) result = casePages(galleryPage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GenerateMePackage.PHOTO:
      {
        Photo photo = (Photo)theEObject;
        T result = casePhoto(photo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenerateMeProgram(GenerateMeProgram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfig(Config object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Home Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Home Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHomePage(HomePage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pages</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pages</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePages(Pages object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContentPage(ContentPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSection(Section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contact Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contact Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContactPage(ContactPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gallery Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gallery Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGalleryPage(GalleryPage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Photo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Photo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhoto(Photo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GenerateMeSwitch
