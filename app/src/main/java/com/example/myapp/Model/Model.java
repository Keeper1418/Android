package com.example.myapp.Model;

import java.util.*;

public class Model {
    private List<Category> categories;
    private Map<String, Preset> presets;

    public List<Category> getCategories() { return categories; }
    public void setCategories(List<Category> value) { this.categories = value; }

    public Map<String, Preset> getPresets() { return presets; }
    public void setPresets(Map<String, Preset> value) { this.presets = value; }
}
