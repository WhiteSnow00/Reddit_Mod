// 
// Decompiled by Procyon v0.6.0
// 

package k1;

import java.util.AbstractMap;
import kotlin.collections.c;
import bg.d;
import kotlin.Pair;
import androidx.compose.ui.autofill.AutofillType;
import java.util.HashMap;

public final class b
{
    public static final HashMap<AutofillType, String> a;
    
    static {
        final Pair pair = new Pair((Object)AutofillType.EmailAddress, (Object)"emailAddress");
        final Pair pair2 = new Pair((Object)AutofillType.Username, (Object)"username");
        final Pair pair3 = new Pair((Object)AutofillType.Password, (Object)"password");
        final Pair pair4 = new Pair((Object)AutofillType.NewUsername, (Object)"newUsername");
        final Pair pair5 = new Pair((Object)AutofillType.NewPassword, (Object)"newPassword");
        final Pair pair6 = new Pair((Object)AutofillType.PostalAddress, (Object)"postalAddress");
        final Pair pair7 = new Pair((Object)AutofillType.PostalCode, (Object)"postalCode");
        final Pair pair8 = new Pair((Object)AutofillType.CreditCardNumber, (Object)"creditCardNumber");
        final Pair pair9 = new Pair((Object)AutofillType.CreditCardSecurityCode, (Object)"creditCardSecurityCode");
        final Pair pair10 = new Pair((Object)AutofillType.CreditCardExpirationDate, (Object)"creditCardExpirationDate");
        final Pair pair11 = new Pair((Object)AutofillType.CreditCardExpirationMonth, (Object)"creditCardExpirationMonth");
        final Pair pair12 = new Pair((Object)AutofillType.CreditCardExpirationYear, (Object)"creditCardExpirationYear");
        final Pair pair13 = new Pair((Object)AutofillType.CreditCardExpirationDay, (Object)"creditCardExpirationDay");
        final Pair pair14 = new Pair((Object)AutofillType.AddressCountry, (Object)"addressCountry");
        final Pair pair15 = new Pair((Object)AutofillType.AddressRegion, (Object)"addressRegion");
        final Pair pair16 = new Pair((Object)AutofillType.AddressLocality, (Object)"addressLocality");
        final Pair pair17 = new Pair((Object)AutofillType.AddressStreet, (Object)"streetAddress");
        final Pair pair18 = new Pair((Object)AutofillType.AddressAuxiliaryDetails, (Object)"extendedAddress");
        final Pair pair19 = new Pair((Object)AutofillType.PostalCodeExtended, (Object)"extendedPostalCode");
        final Pair pair20 = new Pair((Object)AutofillType.PersonFullName, (Object)"personName");
        final Pair pair21 = new Pair((Object)AutofillType.PersonFirstName, (Object)"personGivenName");
        final Pair pair22 = new Pair((Object)AutofillType.PersonLastName, (Object)"personFamilyName");
        final Pair pair23 = new Pair((Object)AutofillType.PersonMiddleName, (Object)"personMiddleName");
        final Pair pair24 = new Pair((Object)AutofillType.PersonMiddleInitial, (Object)"personMiddleInitial");
        final Pair pair25 = new Pair((Object)AutofillType.PersonNamePrefix, (Object)"personNamePrefix");
        final Pair pair26 = new Pair((Object)AutofillType.PersonNameSuffix, (Object)"personNameSuffix");
        final Pair pair27 = new Pair((Object)AutofillType.PhoneNumber, (Object)"phoneNumber");
        final Pair pair28 = new Pair((Object)AutofillType.PhoneNumberDevice, (Object)"phoneNumberDevice");
        final Pair pair29 = new Pair((Object)AutofillType.PhoneCountryCode, (Object)"phoneCountryCode");
        final Pair pair30 = new Pair((Object)AutofillType.PhoneNumberNational, (Object)"phoneNational");
        final Pair pair31 = new Pair((Object)AutofillType.Gender, (Object)"gender");
        final Pair pair32 = new Pair((Object)AutofillType.BirthDateFull, (Object)"birthDateFull");
        final Pair pair33 = new Pair((Object)AutofillType.BirthDateDay, (Object)"birthDateDay");
        final Pair pair34 = new Pair((Object)AutofillType.BirthDateMonth, (Object)"birthDateMonth");
        final Pair pair35 = new Pair((Object)AutofillType.BirthDateYear, (Object)"birthDateYear");
        final Pair pair36 = new Pair((Object)AutofillType.SmsOtpCode, (Object)"smsOTPCode");
        final HashMap a2 = new HashMap(d.o0(36));
        c.d1((AbstractMap)a2, new Pair[] { pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36 });
        a = a2;
    }
}
