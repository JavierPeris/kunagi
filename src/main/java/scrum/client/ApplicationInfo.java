package scrum.client;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ApplicationInfo implements Serializable, IsSerializable {

	public static final String DEPLOYMENT_STAGE_DEVELOPMENT = "DEVELOPMENT";
	public static final String DEPLOYMENT_STAGE_INTEGRATION = "INTEGRATION";
	public static final String DEPLOYMENT_STAGE_PRODUCTION = "PRODUCTION";

	private String name;
	private String release;
	private String build;
	private String deploymentStage;
	private boolean defaultAdminPassword;
	private String currentRelease;

	public ApplicationInfo(String name, String release, String build, String deploymentStage,
			boolean defaultAdminPassword, String currentRelease) {
		this.name = name;
		this.release = release;
		this.build = build;
		this.deploymentStage = deploymentStage;
		this.defaultAdminPassword = defaultAdminPassword;
		this.currentRelease = currentRelease;
	}

	protected ApplicationInfo() {}

	public boolean isNewReleaseAvailable() {
		if (currentRelease == null) return false;
		if (currentRelease.startsWith("dev")) return false;
		return !currentRelease.equals(release);
	}

	public boolean isDefaultAdminPassword() {
		return defaultAdminPassword;
	}

	public String getName() {
		return name;
	}

	public String getRelease() {
		return release;
	}

	public String getCurrentRelease() {
		return currentRelease;
	}

	public String getBuild() {
		return build;
	}

	public String getDeploymentStage() {
		return deploymentStage;
	}

	public boolean isProductionStage() {
		return deploymentStage.equals(DEPLOYMENT_STAGE_PRODUCTION);
	}

	public boolean isDevelopmentStage() {
		return deploymentStage.equals(DEPLOYMENT_STAGE_DEVELOPMENT);
	}

	public String getVersionDescription() {
		return "Kunagi " + release + " | Build " + build + " | " + deploymentStage;
	}

	@Override
	public String toString() {
		return getVersionDescription();
	}

}
