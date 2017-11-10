# Tika (REST) API

## Azure web app

````
<?xml version="1.0" encoding="UTF-8"?>

<configuration>
	<system.webServer>
		<handlers>
			<add name="httpPlatformHandler" path="*" verb="*" modules="httpPlatformHandler" resourceType="Unspecified" />
		</handlers>
		<httpPlatform processPath="%JAVA_HOME%\bin\java.exe"
						arguments="-Djava.net.preferIPv4Stack=true -jar &quot;%HOME%\site\wwwroot\tika-api-0.1.0.jar&quot;"
						stdoutLogEnabled="true"
						stdoutLogFile="%HOME%\site\wwwroot\logs\"
						startupRetryCount='2'>
			<environmentVariables>
        		<environmentVariable name="server.port" value="%HTTP_PLATFORM_PORT%" />
			</environmentVariables>
		</httpPlatform>
	</system.webServer>
</configuration>
````
