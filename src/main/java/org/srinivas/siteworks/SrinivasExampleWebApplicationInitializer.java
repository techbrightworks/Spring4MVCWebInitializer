/**
 * @author SrinivasJasti
 * 
 */
package org.srinivas.siteworks;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * The Class SrinivasExampleWebApplicationInitializer.
 */
public class SrinivasExampleWebApplicationInitializer extends  AbstractAnnotationConfigDispatcherServletInitializer {
	

	private static final Logger logger = LoggerFactory.getLogger(SrinivasExampleWebApplicationInitializer.class);
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		logger.info("SrinivasExampleWebApplicationInitializer getRootConfigClasses Method");
		return new Class<?>[] {MvcContextConfiguration.class};
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		logger.info("SrinivasExampleWebApplicationInitializer getServletConfigClasses Method");
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
	 */
	@Override
	protected String[] getServletMappings() {
		logger.info("SrinivasExampleWebApplicationInitializer getServletMappings Method");
		return new String[]{"/"};
	}
}
