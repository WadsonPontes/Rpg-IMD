@echo off
color 02

set /p version=< version.info
set /p versionc=< versionc.info

:Intro
title RPG-Unknown's (%version%) by fafato
echo.
echo  -RPG-Unknown's %version% by fafato
echo  ========================================================
echo  -Compilador %versionc% by Zoid
echo  ========================================================
echo.
echo  -Iniciando compilador...


:Compiler
for /F "tokens=*" %%A in (classes.info) do (
	echo.
	echo  -Compilando %%A...
	javac -cp . %%A
	ENDLOCAL
)

:Execute
echo.
echo  -Jogo compilado.
echo.
echo  -Iniciando RPG-Unknown's...
echo.
color 04
echo  ========================================================
echo  -SEJA BEM-VINDO AO INFERNO :D
echo  ========================================================
ping 127.0.0.1 -n 3 > nul
start executar.bat
echo.
ping 127.0.0.1 -n 601 > nul
