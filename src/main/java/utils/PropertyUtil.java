package utils;

import constants.FrameworkConstants;
import enums.ConfigProperties;
import exceptions.InvalidFilePathException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class PropertyUtil
{
    private PropertyUtil(){}

    private static Properties property = new Properties();

    static
    {
        try(FileInputStream fis = new FileInputStream(FrameworkConstants.getConfigfilepath());){
            property.load(fis);
        }
        catch(IOException e){
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static String getValue(ConfigProperties key)
    {
        String value = property.getProperty(key.toString());

        if(Objects.isNull(value))
            throw new InvalidFilePathException("Property "+key +"not found.");
        return value;
    }
}
