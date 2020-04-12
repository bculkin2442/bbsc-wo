package er.extensions.functional;

import er.extensions.ERXFrameworkPrincipal;

public class ERBJCExtensions extends ERXFrameworkPrincipal {
	protected static ERBJCExtensions sharedInstance;
	@SuppressWarnings("unchecked")
	public final static Class<? extends ERXFrameworkPrincipal> REQUIRES[] = new Class[] {};

	static {
		setUpFrameworkPrincipalClass(ERBJCExtensions.class);
	}

	public static ERBJCExtensions sharedInstance() {
		if (sharedInstance == null) {
			sharedInstance = sharedInstance(ERBJCExtensions.class);
		}
		return sharedInstance;
	}

	@Override
	public void finishInitialization() {
		log.debug("ERFunctionalExtensions loaded");
	}
}
