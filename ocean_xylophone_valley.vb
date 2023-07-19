Option Explicit

Public Class BridgesToEmployment

    Dim programName As String
    Dim programDescription As String
    Dim programObjectives As String
    Dim programComponents As String
    Dim programLength As String
    Dim targetedPopulations As String
    Dim eligibilityRequirements As String
    Dim programEvaluation As String
    Dim grantInformation As String
        
    Public Sub setProgramName(ByVal value As String)
        programName = value
    End Sub
    
    Public Function getProgramName() As String
        Return programName
    End Function
    
    Public Sub setProgramDescription(ByVal value As String)
        programDescription = value
    End Sub
    
    Public Function getProgramDescription() As String
        Return programDescription
    End Function
    
    Public Sub setProgramObjectives(ByVal value As String)
        programObjectives = value
    End Sub
    
    Public Function getProgramObjectives() As String
        Return programObjectives
    End Function
    
    Public Sub setProgramComponents(ByVal value As String)
        programComponents = value
    End Sub
    
    Public Function getProgramComponents() As String
        Return programComponents
    End Function
    
    Public Sub setProgramLength(ByVal value As String)
        programLength = value
    End Sub
    
    Public Function getProgramLength() As String
        Return programLength
    End Function
    
    Public Sub setTargetedPopulations(ByVal value As String)
        targetedPopulations = value
    End Sub
    
    Public Function getTargetedPopulations() As String
        Return targetedPopulations
    End Function
        
    Public Sub setEligibilityRequirements(ByVal value As String)
        eligibilityRequirements = value
    End Sub
    
    Public Function getEligibilityRequirements() As String
        Return eligibilityRequirements
    End Function
    
    Public Sub setProgramEvaluation(ByVal value As String)
        programEvaluation = value
    End Sub
    
    Public Function getProgramEvaluation() As String
        Return programEvaluation
    End Function
    
    Public Sub setGrantInformation(ByVal value As String)
        grantInformation = value
    End Sub
    
    Public Function getGrantInformation() As String
        Return grantInformation
    End Function
    
    Public Sub printProgramInformation()
        Console.WriteLine(programName)
        Console.WriteLine(programDescription)
        Console.WriteLine(programObjectives)
        Console.WriteLine(programComponents)
        Console.WriteLine(programLength)
        Console.WriteLine(targetedPopulations)
        Console.WriteLine(eligibilityRequirements)
        Console.WriteLine(programEvaluation)
        Console.WriteLine(grantInformation)
    End Sub

End Class