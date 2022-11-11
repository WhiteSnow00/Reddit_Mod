// 
// Decompiled by Procyon v0.6.0
// 

package org.apache.commons.cli;

import java.util.Dictionary;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;
import mk2.d;
import java.util.Collection;
import java.util.Properties;
import java.io.PrintStream;
import java.util.Iterator;
import a4.a0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.io.Serializable;

public class CommandLine implements Serializable
{
    private static final long serialVersionUID = 1L;
    private List args;
    private List options;
    
    public CommandLine() {
        this.args = new LinkedList();
        this.options = new ArrayList();
    }
    
    public final Option a(final String s) {
        final String e0 = a0.E0(s);
        for (final Option option : this.options) {
            if (e0.equals(option.getOpt())) {
                return option;
            }
            if (e0.equals(option.getLongOpt())) {
                return option;
            }
        }
        return null;
    }
    
    public void addArg(final String s) {
        this.args.add(s);
    }
    
    public void addOption(final Option option) {
        this.options.add(option);
    }
    
    public List getArgList() {
        return this.args;
    }
    
    public String[] getArgs() {
        final String[] array = new String[this.args.size()];
        this.args.toArray(array);
        return array;
    }
    
    public Object getOptionObject(final char c) {
        return this.getOptionObject(String.valueOf(c));
    }
    
    public Object getOptionObject(final String s) {
        try {
            return this.getParsedOptionValue(s);
        }
        catch (final ParseException ex) {
            final PrintStream err = System.err;
            final StringBuffer sb = new StringBuffer();
            sb.append("Exception found converting ");
            sb.append(s);
            sb.append(" to desired type: ");
            sb.append(ex.getMessage());
            err.println(sb.toString());
            return null;
        }
    }
    
    public Properties getOptionProperties(final String s) {
        final Properties properties = new Properties();
        for (final Option option : this.options) {
            if (s.equals(option.getOpt()) || s.equals(option.getLongOpt())) {
                final List valuesList = option.getValuesList();
                if (valuesList.size() >= 2) {
                    ((Dictionary<Object, String>)properties).put(valuesList.get(0), valuesList.get(1));
                }
                else {
                    if (valuesList.size() != 1) {
                        continue;
                    }
                    ((Dictionary<Object, String>)properties).put(valuesList.get(0), "true");
                }
            }
        }
        return properties;
    }
    
    public String getOptionValue(final char c) {
        return this.getOptionValue(String.valueOf(c));
    }
    
    public String getOptionValue(final char c, final String s) {
        return this.getOptionValue(String.valueOf(c), s);
    }
    
    public String getOptionValue(String s) {
        final String[] optionValues = this.getOptionValues(s);
        if (optionValues == null) {
            s = null;
        }
        else {
            s = optionValues[0];
        }
        return s;
    }
    
    public String getOptionValue(String optionValue, String s) {
        optionValue = this.getOptionValue(optionValue);
        if (optionValue != null) {
            s = optionValue;
        }
        return s;
    }
    
    public String[] getOptionValues(final char c) {
        return this.getOptionValues(String.valueOf(c));
    }
    
    public String[] getOptionValues(final String s) {
        final ArrayList list = new ArrayList();
        for (final Option option : this.options) {
            if (s.equals(option.getOpt()) || s.equals(option.getLongOpt())) {
                list.addAll(option.getValuesList());
            }
        }
        String[] array;
        if (list.isEmpty()) {
            array = null;
        }
        else {
            array = list.toArray(new String[list.size()]);
        }
        return array;
    }
    
    public Option[] getOptions() {
        final List options = this.options;
        return (Option[])options.toArray(new Option[options.size()]);
    }
    
    public Object getParsedOptionValue(String s) throws ParseException {
        final String optionValue = this.getOptionValue(s);
        final Option a = this.a(s);
        s = null;
        if (a == null) {
            return null;
        }
        final Object type = a.getType();
        if (optionValue != null) {
            final Class clazz = (Class)type;
            if (d.a == clazz) {
                s = optionValue;
            }
            else {
                if (d.b == clazz) {
                    try {
                        final Class<?> forName = Class.forName(optionValue);
                        try {
                            s = (String)forName.newInstance();
                        }
                        catch (final Exception ex) {
                            final StringBuffer sb = new StringBuffer();
                            sb.append(ex.getClass().getName());
                            sb.append("; Unable to create an instance of: ");
                            sb.append(optionValue);
                            throw new ParseException(sb.toString());
                        }
                    }
                    catch (final ClassNotFoundException ex2) {
                        final StringBuffer sb2 = new StringBuffer();
                        sb2.append("Unable to find the class: ");
                        sb2.append(optionValue);
                        throw new ParseException(sb2.toString());
                    }
                }
                if (d.c == clazz) {
                    try {
                        if (optionValue.indexOf(46) != -1) {
                            s = (String)Double.valueOf(optionValue);
                            return s;
                        }
                        s = (String)Long.valueOf(optionValue);
                        return s;
                    }
                    catch (final NumberFormatException ex3) {
                        throw new ParseException(ex3.getMessage());
                    }
                }
                if (d.d == clazz) {
                    throw new UnsupportedOperationException("Not yet implemented");
                }
                if (d.e == clazz) {
                    try {
                        s = (String)Class.forName(optionValue);
                        return s;
                    }
                    catch (final ClassNotFoundException ex4) {
                        final StringBuffer sb3 = new StringBuffer();
                        sb3.append("Unable to find the class: ");
                        sb3.append(optionValue);
                        throw new ParseException(sb3.toString());
                    }
                }
                if (d.g == clazz) {
                    s = (String)new File(optionValue);
                }
                else if (d.f == clazz) {
                    s = (String)new File(optionValue);
                }
                else {
                    if (d.h == clazz) {
                        throw new UnsupportedOperationException("Not yet implemented");
                    }
                    if (d.i == clazz) {
                        try {
                            s = (String)new URL(optionValue);
                            return s;
                        }
                        catch (final MalformedURLException ex5) {
                            final StringBuffer sb4 = new StringBuffer();
                            sb4.append("Unable to parse the URL: ");
                            sb4.append(optionValue);
                            throw new ParseException(sb4.toString());
                        }
                    }
                    s = null;
                }
            }
        }
        return s;
    }
    
    public boolean hasOption(final char c) {
        return this.hasOption(String.valueOf(c));
    }
    
    public boolean hasOption(final String s) {
        return this.options.contains(this.a(s));
    }
    
    public Iterator iterator() {
        return this.options.iterator();
    }
}
