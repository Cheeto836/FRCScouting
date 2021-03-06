
import sys
import os

def _autogenScriptInfo_Str(version, scriptname):
	s = "-----------------------------------------------------\n"
	s += str(scriptname) +" "+ str(version) +'\n'
	s += '\n'
	s += "This file was autogenerated with run cmd:\n"
	s += "  \""
	for arg in sys.argv:
		s += arg +" "
	s = s[0:-1] # get rid of trailing space
	s += '\"\n'
	s += '\n'
	s += "python version info:\n"
	s += "  "+ str(sys.version) +'\n'
	s += '\n'
	s += "Please take heed of modifying unnecessarily\n"
	s += "-----------------------------------------------------"
	return s