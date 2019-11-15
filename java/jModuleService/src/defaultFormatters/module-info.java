module defaultFormatters {
    requires formatters;

    provides edu.dateformatters.DateFormatter with 
    edu.def.dateformatters.MMDDYYDateFormatter;
}