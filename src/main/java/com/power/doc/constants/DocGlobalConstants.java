package com.power.doc.constants;

/**
 * @author yu 2018/12/15.
 */
public class DocGlobalConstants {

    public static final String FILE_SEPARATOR = System.getProperty("file.separator");

    /**
     * html doc在spring mvc的输出路径
     */
    public static final String HTML_DOC_OUT_PATH = "src/main/resources/static/doc";

    public static final String DOC_LANGUAGE = "smart-doc_language";

    public static final String API_DOC_TPL = "ApiDoc.btl";

    public static final String HTML_API_DOC_TPL = "HtmlApiDoc.btl";

    public static final String ERROR_CODE_LIST_TPL = "ErrorCodeList.btl";

    public static final String ERROR_CODE_LIST_MD = "ErrorCodeList.md";

    public static final String INDEX_TPL = "Index.btl";

    public static final String INDEX_CSS_TPL = "index.css";

    public static final String MARKDOWN_CSS_TPL = "markdown.css";
    /**
     * controller注解全名称
     */
    public static final String CONTROLLER_FULLY = "org.springframework.stereotype.Controller";

    /**
     * rest controller注解全名称
     */
    public static final String REST_CONTROLLER_FULLY = "org.springframework.web.bind.annotation.RestController";

    public static final String GET_MAPPING_FULLY = "org.springframework.web.bind.annotation.GetMapping";

    public static final String POST_MAPPING_FULLY = "org.springframework.web.bind.annotation.PostMapping";

    public static final String PUT_MAPPING_FULLY = "org.springframework.web.bind.annotation.PutMapping";

    public static final String DELETE_MAPPING_FULLY = "org.springframework.web.bind.annotation.DeleteMapping";

    public static final String REQUEST_MAPPING_FULLY = "org.springframework.web.bind.annotation.RequestMapping";

    public static final String REQUEST_BODY_FULLY = "org.springframework.web.bind.annotation.RequestBody";

    public static final String MODE_AND_VIEW_FULLY = "org.springframework.web.servlet.ModelAndView";
    /**
     * java object类名
     */
    public static final String JAVA_OBJECT_FULLY = "java.lang.Object";

    public static final String JAVA_STRING_FULLY = "java.lang.String";

    public static final String JAVA_MAP_FULLY = "java.util.Map";

    public static final String JAVA_LIST_FULLY = "java.util.List";



}