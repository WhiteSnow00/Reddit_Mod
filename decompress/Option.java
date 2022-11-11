// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.cli;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Option implements Cloneable, Serializable
{
    public static final int UNINITIALIZED = -1;
    public static final int UNLIMITED_VALUES = -2;
    private static final long serialVersionUID = 1L;
    private String argName;
    private String description;
    private String longOpt;
    private int numberOfArgs;
    private String opt;
    private boolean optionalArg;
    private boolean required;
    private Object type;
    private List values;
    private char valuesep;
    
    public Option(final String s, final String s2) throws IllegalArgumentException {
        this(s, null, false, s2);
    }
    
    public Option(final String opt, final String longOpt, final boolean b, final String description) throws IllegalArgumentException {
        this.argName = "arg";
        this.numberOfArgs = -1;
        this.values = new ArrayList();
        if (opt != null) {
            final int length = opt.length();
            final int n = 0;
            boolean b2 = false;
            if (length == 1) {
                final char char1 = opt.charAt(0);
                if (Character.isJavaIdentifierPart(char1) || char1 == ' ' || char1 == '?' || char1 == '@') {
                    b2 = true;
                }
                if (!b2) {
                    final StringBuffer sb = new StringBuffer();
                    sb.append("illegal option value '");
                    sb.append(char1);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            else {
                final char[] charArray = opt.toCharArray();
                for (int i = n; i < charArray.length; ++i) {
                    if (!Character.isJavaIdentifierPart(charArray[i])) {
                        final StringBuffer sb2 = new StringBuffer();
                        sb2.append("opt contains illegal character value '");
                        sb2.append(charArray[i]);
                        sb2.append("'");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            }
        }
        this.opt = opt;
        this.longOpt = longOpt;
        if (b) {
            this.numberOfArgs = 1;
        }
        this.description = description;
    }
    
    public Option(final String s, final boolean b, final String s2) throws IllegalArgumentException {
        this(s, null, b, s2);
    }
    
    public boolean addValue(final String s) {
        throw new UnsupportedOperationException("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
    }
    
    public void addValueForProcessing(String substring) {
        if (this.numberOfArgs != -1) {
            String s = substring;
            if (this.hasValueSeparator()) {
                final char valueSeparator = this.getValueSeparator();
                int n = substring.indexOf(valueSeparator);
                while (true) {
                    s = substring;
                    if (n == -1) {
                        break;
                    }
                    if (this.values.size() == this.numberOfArgs - 1) {
                        s = substring;
                        break;
                    }
                    this.b(substring.substring(0, n));
                    substring = substring.substring(n + 1);
                    n = substring.indexOf(valueSeparator);
                }
            }
            this.b(s);
            return;
        }
        throw new RuntimeException("NO_ARGS_ALLOWED");
    }
    
    public final void b(final String s) {
        if (this.numberOfArgs > 0 && this.values.size() > this.numberOfArgs - 1) {
            throw new RuntimeException("Cannot add value, list full.");
        }
        this.values.add(s);
    }
    
    public void clearValues() {
        this.values.clear();
    }
    
    public Object clone() {
        try {
            final Option option = (Option)super.clone();
            option.values = new ArrayList(this.values);
            return option;
        }
        catch (final CloneNotSupportedException ex) {
            final StringBuffer sb = new StringBuffer();
            sb.append("A CloneNotSupportedException was thrown: ");
            sb.append(ex.getMessage());
            throw new RuntimeException(sb.toString());
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Option option = (Option)o;
            final String opt = this.opt;
            Label_0062: {
                if (opt != null) {
                    if (opt.equals(option.opt)) {
                        break Label_0062;
                    }
                }
                else if (option.opt == null) {
                    break Label_0062;
                }
                return false;
            }
            final String longOpt = this.longOpt;
            final String longOpt2 = option.longOpt;
            if (longOpt != null) {
                if (longOpt.equals(longOpt2)) {
                    return true;
                }
            }
            else if (longOpt2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public String getArgName() {
        return this.argName;
    }
    
    public int getArgs() {
        return this.numberOfArgs;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public int getId() {
        return this.getKey().charAt(0);
    }
    
    public String getKey() {
        String s;
        if ((s = this.opt) == null) {
            s = this.longOpt;
        }
        return s;
    }
    
    public String getLongOpt() {
        return this.longOpt;
    }
    
    public String getOpt() {
        return this.opt;
    }
    
    public Object getType() {
        return this.type;
    }
    
    public String getValue() {
        String s;
        if (this.values.isEmpty()) {
            s = null;
        }
        else {
            s = this.values.get(0);
        }
        return s;
    }
    
    public String getValue(final int n) throws IndexOutOfBoundsException {
        String s;
        if (this.values.isEmpty()) {
            s = null;
        }
        else {
            s = this.values.get(n);
        }
        return s;
    }
    
    public String getValue(String s) {
        final String value = this.getValue();
        if (value != null) {
            s = value;
        }
        return s;
    }
    
    public char getValueSeparator() {
        return this.valuesep;
    }
    
    public String[] getValues() {
        String[] array;
        if (this.values.isEmpty()) {
            array = null;
        }
        else {
            final List values = this.values;
            array = values.toArray(new String[values.size()]);
        }
        return array;
    }
    
    public List getValuesList() {
        return this.values;
    }
    
    public boolean hasArg() {
        final int numberOfArgs = this.numberOfArgs;
        return numberOfArgs > 0 || numberOfArgs == -2;
    }
    
    public boolean hasArgName() {
        final String argName = this.argName;
        return argName != null && argName.length() > 0;
    }
    
    public boolean hasArgs() {
        final int numberOfArgs = this.numberOfArgs;
        boolean b = true;
        if (numberOfArgs <= 1) {
            b = (numberOfArgs == -2 && b);
        }
        return b;
    }
    
    public boolean hasLongOpt() {
        return this.longOpt != null;
    }
    
    public boolean hasOptionalArg() {
        return this.optionalArg;
    }
    
    public boolean hasValueSeparator() {
        return this.valuesep > '\0';
    }
    
    @Override
    public int hashCode() {
        final String opt = this.opt;
        int hashCode = 0;
        int hashCode2;
        if (opt != null) {
            hashCode2 = opt.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String longOpt = this.longOpt;
        if (longOpt != null) {
            hashCode = longOpt.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public boolean isRequired() {
        return this.required;
    }
    
    public void setArgName(final String argName) {
        this.argName = argName;
    }
    
    public void setArgs(final int numberOfArgs) {
        this.numberOfArgs = numberOfArgs;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setLongOpt(final String longOpt) {
        this.longOpt = longOpt;
    }
    
    public void setOptionalArg(final boolean optionalArg) {
        this.optionalArg = optionalArg;
    }
    
    public void setRequired(final boolean required) {
        this.required = required;
    }
    
    public void setType(final Object type) {
        this.type = type;
    }
    
    public void setValueSeparator(final char c) {
        this.valuesep = c;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("[ option: ");
        sb.append(this.opt);
        if (this.longOpt != null) {
            sb.append(" ");
            sb.append(this.longOpt);
        }
        sb.append(" ");
        if (this.hasArgs()) {
            sb.append("[ARG...]");
        }
        else if (this.hasArg()) {
            sb.append(" [ARG]");
        }
        sb.append(" :: ");
        sb.append(this.description);
        if (this.type != null) {
            sb.append(" :: ");
            sb.append(this.type);
        }
        sb.append(" ]");
        return sb.toString();
    }
}
