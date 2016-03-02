/**
 */
package cevinedit.impl;

import cevinedit.Brightness;
import cevinedit.CevineditPackage;
import cevinedit.Color;
import cevinedit.FontStyle;
import cevinedit.Link;
import cevinedit.LinkEReferenceNonCont;
import cevinedit.LinkFigure;
import cevinedit.Texture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link EReference Non Cont</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cevinedit.impl.LinkEReferenceNonContImpl#getBrightness <em>Brightness</em>}</li>
 *   <li>{@link cevinedit.impl.LinkEReferenceNonContImpl#getColor <em>Color</em>}</li>
 *   <li>{@link cevinedit.impl.LinkEReferenceNonContImpl#getLabelFontStyle <em>Label Font Style</em>}</li>
 *   <li>{@link cevinedit.impl.LinkEReferenceNonContImpl#getSourceDecoration <em>Source Decoration</em>}</li>
 *   <li>{@link cevinedit.impl.LinkEReferenceNonContImpl#getTargetDecoration <em>Target Decoration</em>}</li>
 *   <li>{@link cevinedit.impl.LinkEReferenceNonContImpl#getTexture <em>Texture</em>}</li>
 *   <li>{@link cevinedit.impl.LinkEReferenceNonContImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link cevinedit.impl.LinkEReferenceNonContImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEReferenceNonContImpl extends PersonalizedElementImpl implements LinkEReferenceNonCont {
	/**
	 * The default value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected static final Brightness BRIGHTNESS_EDEFAULT = Brightness.DEFAULT;

	/**
	 * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
	protected Brightness brightness = BRIGHTNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.DEFAULT;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelFontStyle() <em>Label Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final FontStyle LABEL_FONT_STYLE_EDEFAULT = FontStyle.DEFAULT;

	/**
	 * The cached value of the '{@link #getLabelFontStyle() <em>Label Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFontStyle()
	 * @generated
	 * @ordered
	 */
	protected FontStyle labelFontStyle = LABEL_FONT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceDecoration() <em>Source Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDecoration()
	 * @generated
	 * @ordered
	 */
	protected static final LinkFigure SOURCE_DECORATION_EDEFAULT = LinkFigure.DEFAULT;

	/**
	 * The cached value of the '{@link #getSourceDecoration() <em>Source Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDecoration()
	 * @generated
	 * @ordered
	 */
	protected LinkFigure sourceDecoration = SOURCE_DECORATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDecoration() <em>Target Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDecoration()
	 * @generated
	 * @ordered
	 */
	protected static final LinkFigure TARGET_DECORATION_EDEFAULT = LinkFigure.DEFAULT;

	/**
	 * The cached value of the '{@link #getTargetDecoration() <em>Target Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDecoration()
	 * @generated
	 * @ordered
	 */
	protected LinkFigure targetDecoration = TARGET_DECORATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTexture() <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected static final Texture TEXTURE_EDEFAULT = Texture.DEFAULT;

	/**
	 * The cached value of the '{@link #getTexture() <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected Texture texture = TEXTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEReferenceNonContImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CevineditPackage.Literals.LINK_EREFERENCE_NON_CONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brightness getBrightness() {
		return brightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrightness(Brightness newBrightness) {
		Brightness oldBrightness = brightness;
		brightness = newBrightness == null ? BRIGHTNESS_EDEFAULT : newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.LINK_EREFERENCE_NON_CONT__BRIGHTNESS, oldBrightness, brightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.LINK_EREFERENCE_NON_CONT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle getLabelFontStyle() {
		return labelFontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelFontStyle(FontStyle newLabelFontStyle) {
		FontStyle oldLabelFontStyle = labelFontStyle;
		labelFontStyle = newLabelFontStyle == null ? LABEL_FONT_STYLE_EDEFAULT : newLabelFontStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL_FONT_STYLE, oldLabelFontStyle, labelFontStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkFigure getSourceDecoration() {
		return sourceDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDecoration(LinkFigure newSourceDecoration) {
		LinkFigure oldSourceDecoration = sourceDecoration;
		sourceDecoration = newSourceDecoration == null ? SOURCE_DECORATION_EDEFAULT : newSourceDecoration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.LINK_EREFERENCE_NON_CONT__SOURCE_DECORATION, oldSourceDecoration, sourceDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkFigure getTargetDecoration() {
		return targetDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDecoration(LinkFigure newTargetDecoration) {
		LinkFigure oldTargetDecoration = targetDecoration;
		targetDecoration = newTargetDecoration == null ? TARGET_DECORATION_EDEFAULT : newTargetDecoration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.LINK_EREFERENCE_NON_CONT__TARGET_DECORATION, oldTargetDecoration, targetDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texture getTexture() {
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexture(Texture newTexture) {
		Texture oldTexture = texture;
		texture = newTexture == null ? TEXTURE_EDEFAULT : newTexture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.LINK_EREFERENCE_NON_CONT__TEXTURE, oldTexture, texture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.LINK_EREFERENCE_NON_CONT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__BRIGHTNESS:
				return getBrightness();
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__COLOR:
				return getColor();
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL_FONT_STYLE:
				return getLabelFontStyle();
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__SOURCE_DECORATION:
				return getSourceDecoration();
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__TARGET_DECORATION:
				return getTargetDecoration();
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__TEXTURE:
				return getTexture();
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__WIDTH:
				return getWidth();
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__BRIGHTNESS:
				setBrightness((Brightness)newValue);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__COLOR:
				setColor((Color)newValue);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL_FONT_STYLE:
				setLabelFontStyle((FontStyle)newValue);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__SOURCE_DECORATION:
				setSourceDecoration((LinkFigure)newValue);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__TARGET_DECORATION:
				setTargetDecoration((LinkFigure)newValue);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__TEXTURE:
				setTexture((Texture)newValue);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__WIDTH:
				setWidth((Integer)newValue);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL:
				setLabel((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__BRIGHTNESS:
				setBrightness(BRIGHTNESS_EDEFAULT);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL_FONT_STYLE:
				setLabelFontStyle(LABEL_FONT_STYLE_EDEFAULT);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__SOURCE_DECORATION:
				setSourceDecoration(SOURCE_DECORATION_EDEFAULT);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__TARGET_DECORATION:
				setTargetDecoration(TARGET_DECORATION_EDEFAULT);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__TEXTURE:
				setTexture(TEXTURE_EDEFAULT);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__BRIGHTNESS:
				return brightness != BRIGHTNESS_EDEFAULT;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__COLOR:
				return color != COLOR_EDEFAULT;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL_FONT_STYLE:
				return labelFontStyle != LABEL_FONT_STYLE_EDEFAULT;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__SOURCE_DECORATION:
				return sourceDecoration != SOURCE_DECORATION_EDEFAULT;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__TARGET_DECORATION:
				return targetDecoration != TARGET_DECORATION_EDEFAULT;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__TEXTURE:
				return texture != TEXTURE_EDEFAULT;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Link.class) {
			switch (derivedFeatureID) {
				case CevineditPackage.LINK_EREFERENCE_NON_CONT__BRIGHTNESS: return CevineditPackage.LINK__BRIGHTNESS;
				case CevineditPackage.LINK_EREFERENCE_NON_CONT__COLOR: return CevineditPackage.LINK__COLOR;
				case CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL_FONT_STYLE: return CevineditPackage.LINK__LABEL_FONT_STYLE;
				case CevineditPackage.LINK_EREFERENCE_NON_CONT__SOURCE_DECORATION: return CevineditPackage.LINK__SOURCE_DECORATION;
				case CevineditPackage.LINK_EREFERENCE_NON_CONT__TARGET_DECORATION: return CevineditPackage.LINK__TARGET_DECORATION;
				case CevineditPackage.LINK_EREFERENCE_NON_CONT__TEXTURE: return CevineditPackage.LINK__TEXTURE;
				case CevineditPackage.LINK_EREFERENCE_NON_CONT__WIDTH: return CevineditPackage.LINK__WIDTH;
				case CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL: return CevineditPackage.LINK__LABEL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Link.class) {
			switch (baseFeatureID) {
				case CevineditPackage.LINK__BRIGHTNESS: return CevineditPackage.LINK_EREFERENCE_NON_CONT__BRIGHTNESS;
				case CevineditPackage.LINK__COLOR: return CevineditPackage.LINK_EREFERENCE_NON_CONT__COLOR;
				case CevineditPackage.LINK__LABEL_FONT_STYLE: return CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL_FONT_STYLE;
				case CevineditPackage.LINK__SOURCE_DECORATION: return CevineditPackage.LINK_EREFERENCE_NON_CONT__SOURCE_DECORATION;
				case CevineditPackage.LINK__TARGET_DECORATION: return CevineditPackage.LINK_EREFERENCE_NON_CONT__TARGET_DECORATION;
				case CevineditPackage.LINK__TEXTURE: return CevineditPackage.LINK_EREFERENCE_NON_CONT__TEXTURE;
				case CevineditPackage.LINK__WIDTH: return CevineditPackage.LINK_EREFERENCE_NON_CONT__WIDTH;
				case CevineditPackage.LINK__LABEL: return CevineditPackage.LINK_EREFERENCE_NON_CONT__LABEL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (brightness: ");
		result.append(brightness);
		result.append(", color: ");
		result.append(color);
		result.append(", labelFontStyle: ");
		result.append(labelFontStyle);
		result.append(", sourceDecoration: ");
		result.append(sourceDecoration);
		result.append(", targetDecoration: ");
		result.append(targetDecoration);
		result.append(", texture: ");
		result.append(texture);
		result.append(", width: ");
		result.append(width);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //LinkEReferenceNonContImpl
