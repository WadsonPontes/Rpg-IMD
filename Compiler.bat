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
echo  -Iniciando RPG-Unknown's...
start executar.bat
echo.
echo  ========================================================
echo  -Jogo compilado.
color 04
ping 127.0.0.1 -n 2 > nul
echo  -SEJA BEM-VINDO AO INFERNO :D
echo  ========================================================
echo.
ping 127.0.0.1 -n 601 > nul
